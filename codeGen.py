# -*- coding: utf-8 -*-
"""
Created on Fri Jul 16 13:45:58 2021

@author: chengyou

    This codeGen.py splits to 2 major part, 1st and 2nd AST traverse
    1. 1st AST traverse: table establish
    2. 2nd AST traverse: assembly code generate

"""

from ete3 import Tree
from string import Template
import sys
import operator

## ----------------------------------------------------------------------------
    # 1st table establish: talbe estimating
    # There are many kinds of tables
    # 1. Label Table: to record usage count of variables and consts and record line number
    # 2. SP table: to allocate variable in memory (sp: stack pointer)
    # 3. struct Table: record var types detail, ex: type name, type length, struct
    # 4. global var Table
## ----------------------------------------------------------------------------
    
normalOps = ['+', '-', '*', '/', '%', '&', '^', '|']
compOps = ['==', '!=', '>', '<', '>=', '<=']
incdec = ['++', '--']
ops = normalOps + compOps + incdec

varCount = 0
labelTable = {}

# label Table Content = [label value, label type, label content type, content length, code begin, code end, liveable]
# for example: int x
# label name: x
# label type: variable
# label content type: int
# content length: 4
# code begin: 0
# code end: 0
# liveable: False

# | label name | label type | content type | content length | LineNo Begin | LineNoEnd | liveable |
# |     x      | variable   | int          | 4              | 1            | 2         | False    |


def addNewLabel2labelTable(labelName, labelType, contentType, contentLen, LineNoBegin, spPosition, liveable):
    '''
        string addNewLabel2labelTable(labelName: string, labelType: string, contentType: string, LineNoBegin: int, liveable: bool)
        ## add new variable or const into label table
        
        labelName: new label name
        labelType: type of label (variable or const)
        contentLen: content length
        LineNoBegin: start line of this label
        liveable: label live or not
        
        return labelName: string
    '''
    global labelTable
    
    if(labelName.name.isdigit()):
        if(int(labelName.name) > 2147483647 or int(labelName.name) < -2147483648):
            # integer value out of range
            print('================================')
            print('Compiler line number: %i'%sys._getframe().f_lineno)
            print('C file line number: ')
            print('Value out of range: %s'%labelName)
            print('================================')
            sys.exit(-1)
    labelContent = {}
    labelContent['labelType']   = labelType
    labelContent['contentType'] = contentType
    labelContent['contentLen']  = contentLen
    labelContent['lineNoBegin'] = LineNoBegin
    labelContent['lineNoEnd']   = 0
    labelContent['spPosition']  = spPosition
    labelContent['liveable']    = False
    labelTable[labelName.name]  = labelContent
    return labelName.name

def checkAndAddLabelTable(t, codeLN):
    '''
        None checkAndAddLabelTable(t: ete3 Tree, codeLN: int)
        # check this label's format and add it in label table
        
        t: label(Tree format)
        codeLN: code line number
        
        return None
    '''
    if(t.name == 'int' or t.name == 'intConst'):
        intContent = t.children[0]
        if(intContent in labelTable):
            # if this intConst already exist in labelTable, set code end LN
            labelTable[intContent]['lineNoEnd'] = codeLN
        else:
            # if not, add this intConst in labelTable
            addNewLabel2labelTable(intContent, 'const', 'int', 4, codeLN, None, False)
    elif(t.name == 'ID'):
        # handle variable
        varName = t.children[0].name
        if(varName in labelTable):
            # if this variable already in label table
            labelTable[varName]['lineNoEnd'] = codeLN
        elif(varName in globalVarTable):
            pass
        else:
            handle_error(codeLN, sys._getframe().f_lineno, 'variable \'%s\' not declare yet'%(varName))
    elif(t.name == 'myArrayVar'):
        # handle arrayVar
        arrayName = t.children[0].children[0].name
        arrayIndex = t.children[1].children[0]
        if(arrayName in labelTable):
            # if this variable already in label table
            labelTable[arrayName]['lineNoEnd'] = codeLN
        elif(varName in globalVarTable):
            pass
        else:
            handle_error(codeLN, sys._getframe().f_lineno, 'variable \'%s\' not declare yet'%(varName))
        checkAndAddLabelTable(arrayIndex, codeLN)
        
    elif(t.name == 'myExpr'):
        # handle expr
        labelTable_Expr(t, codeLN)
    elif(t.name == 'addrContent'):
        # get the address content (&a)
        labelTable_Expr(t, codeLN)
    elif(t.name == 'varAddr'):
        # get the address of variable
        varName = t.children[0].children[0].name
        if(varName in labelTable):
            # if this variable already in label table
            labelTable[varName]['lineNoEnd'] = codeLN
        else:
            # error
            handle_error(codeLN, sys._getframe().f_lineno, 'variable \'%s\' not declare yet'%(varName))
    elif(t.name == 'myFuncCall'):
        # handle sub program
        inputPara = t.children[1]
        for ip in inputPara.children:
            checkAndAddLabelTable(ip, codeLN)
        pass
    elif(t.name == 'None'):
        pass
    elif(t.name == 'myCasting'):
        checkAndAddLabelTable(t.children[1], codeLN)
    else:
        handle_error(codeLN, sys._getframe().f_lineno, 'Unknow label name: %s'%(t.name))
        
        
## ----------------------------------------------------------------------------
spTable = []
## Building SP table
def newSpTable(varCount):
    sp=[]
    for i in range(0, varCount):
        spTmp = {}
        spTmp['index'] = 4*i;
        spTmp['varName'] = None;
        sp.append(spTmp)
    return sp
        
## ----------------------------------------------------------------------------
## Building structTable
structTable = {}

## ----------------------------------------------------------------------------
## Building global var Table
globalVarTable = {}

## ----------------------------------------------------------------------------
'''
## handle different type of user code

myDeclare: Dclare a Variable
->(variable type),(variable name)
ex: int x;

myAssign: code w/ '='
->(assigned variable),('='),(expr)
ex: x = 3;

Expr: a simple expression
->(integer),(operator),(integer)
operator: '+', '-', '*', '/'
ex: x = 5 + 6;

'''

def handle_error(cLN, compilerLN, detail):
    '''
        show c file line number and compiler line number when error happened
    '''
    print('================================')
    print('C file line number: '+str(cLN))
    print('Compiler line number: %i'%compilerLN)
    print(detail)
    print('================================')
    sys.exit(-1)

def findLN(progBody, i):
    '''
        int findLN(progBody: ete3 Tree, i: int)
        # find c file line number by myLN token
        
        progBody: the whole progBody
        i: from this line check down where the 'myLN' is
        return: real c file line number
    '''
    while(progBody.children[i].name != 'myNL'):
        i=i+1
    return int(progBody.children[i].children[0].name)
    

def handle_DeclareTypes(t, codeLN):
    '''
        None handle_DeclareTypes(t: ete3Tree, codeLN: int)
        Handle different declare types (ex: normal var, ptr var, array var...)
        *This version only handle int variable*
        
        t: declare user code (Tree format)
        codeLN: user code line number
    '''
    
    INT_LEN = 4  # int content length
    
    declareType = t.search_nodes(name="type")[0].children[0].name
    varName = t.search_nodes(name = 'var')[0].children[0]
    
    if('*' in declareType):             # handle normal ptr var    
        contentLen = INT_LEN
        declareVarCount = 1
        
    elif('[' in declareType):           # handle array var
        declareVarCount = int(declareType[declareType.find('[')+1:declareType.find(']')])
        contentLen = INT_LEN * declareVarCount
        
    elif(declareType == 'myStruct'):    # handle struct var
        structName = t.search_nodes(name="myStruct")[0].children[0].name
        declareType = 'struct ' + structName
        contentLen = len(structTable[structName])*4
        declareVarCount = structTable[structName]['varCount']
        
    else:                               # handle normal var
        contentLen = INT_LEN
        declareVarCount = 1
        
    return varName, declareType, contentLen, declareVarCount

def labelTable_Declare(t, codeLN):
    '''
        None labelTable_Declare(t: ete3Tree, codeLN: int)
        Handle declare and put variable or const into label table
        *This version only handle int type of variable*
        
        t: declare user code (Tree format)
        codeLN: user code line number
    '''
    global varCount
    varName, declareType, contentLen, declareVarCount = handle_DeclareTypes(t, codeLN)
    
    # check if this var in label table
    if(varName in labelTable):
            handle_error(codeLN, sys._getframe().f_lineno, 'Variable already declare: %s'%(varName))
    else:
        # add this var in label table
        spPosition = varCount*4
        addNewLabel2labelTable(varName, 'var', declareType, contentLen, codeLN, spPosition, False)
        
        # chenge varCount
        varCount += declareVarCount
        
'''
def labelTable_Assign(t, codeLN):
    
    # handle variable, set code end
    # if variable already in label table
    assignLeft = t.search_nodes(name = "assignLeft")[0].children[0]
    assignRight = t.search_nodes(name = "assignRight")[0].children[0]
    checkAndAddLabelTable(assignLeft, codeLN)
    checkAndAddLabelTable(assignRight, codeLN)
'''

def labelTable_Return(t, codeLN):
    '''
        None labelTable_Return(t: ete3Tree, codeLN: int)
        handle return and put variable or const into label table
        
        t: user code (Tree format)
        codeLN: user code line number
    '''
    returnValue = t.search_nodes(name = 'myReturn')[0].children[0]
    checkAndAddLabelTable(returnValue, codeLN)
    
def labelTable_Expr(t, codeLN):
    '''
        None labelTable_Expr(t: ete3Tree, codeLN: int)
        handle expression and put variable or const into label table
        
        t: user code (Tree format)
        codeLN: user code line number
    '''
    for e in t.children:
        if(e.name == 'op'):
            continue
        else:
            checkAndAddLabelTable(e, codeLN)

def labelTable_selection(t):
    # handle if else
    ifCondi = t.search_nodes(name='ifCondi')[0].children[0]
    ifCodeBlock = t.search_nodes(name='ifBody')[0]
    
    labelTable_Expr(ifCondi, findLN(ifCodeBlock, 0))
    labelTable_codeBodyFilter(ifCodeBlock)
    
    if(t.search_nodes(name='elseBody') == []):
        elseCodeBlock = None
    else:
        # if else code block exist
        elseCodeBlock = t.search_nodes(name='elseBody')[0]
        labelTable_codeBodyFilter(elseCodeBlock)
        
def labelTable_iteration(t):
    forInit = t.search_nodes(name = 'forInit')[0].children[0]
    forCondi = t.search_nodes(name = 'forCondi')[0].children[0]
    forIncrement = t.search_nodes(name = 'forIncrement')[0].children[0]
    forBody = t.search_nodes(name = 'forBody')[0]
    
    # handle forInit
    if(forInit.name == 'myDeclare'):
        labelTable_Declare(forInit, findLN(t,0))
    elif(forInit.name == 'myExpr'):
        labelTable_Expr(forInit, findLN(t,0))
    elif(forInit.name == 'None'):
        pass
    else:
        handle_error(findLN(t, 0), sys._getframe().f_lineno, 'Unknow user code type: %s'%(forInit.name))
        
    # handle forCondition
    if(forCondi.name == 'None'):
        pass
    else:
        labelTable_Expr(forCondi, findLN(t, 0))
    
    # handle for Increment
    if(forIncrement.name == 'None'):
        pass
    else:
        labelTable_Expr(forIncrement, findLN(t,0))
        
    # handle for body
    labelTable_codeBodyFilter(forBody)
            
def labelTable_codeBodyFilter(t):
     # handle different types of user code
    for i in range(len(t.children)):
        if(t.children[i].name == 'myNL' or t.children[i].name == 'None'):
            continue
        elif(t.children[i].name == 'myDeclare'):
            labelTable_Declare(t.children[i], findLN(t, i))
        elif(t.children[i].name == 'myExpr'):
            labelTable_Expr(t.children[i], findLN(t, i))
        elif(t.children[i].name == 'myReturn'):
            labelTable_Return(t.children[i], findLN(t, i))
        elif(t.children[i].name == 'mySelection'):
            labelTable_selection(t.children[i])
        elif(t.children[i].name == 'myIteration'):
            labelTable_iteration(t.children[i])
        elif(t.children[i].name == 'myFuncCall'):
            checkAndAddLabelTable(t.children[i], findLN(t, i))
        else:
            # error handle
            handle_error(findLN(t, i), sys._getframe().f_lineno, 'Unknow user code type: %s'%(t.children[i].name))
            
def global_Declare(t, codeLN):
    # handle global declare
    global globalVarTable
    if(t.children[0].name == 'globalDeclare'):
        varType = t.search_nodes(name = 'declareType')[0].children[0].name
        varName = t.search_nodes(name = 'varName')[0].children[0].children[0].name
        initValue = t.search_nodes(name = 'initValue')[0].children[0].children[0].name
        tableContent = {}
        tableContent['varType']=varType
        tableContent['initValue']=initValue
        globalVarTable[varName]=tableContent
    elif(t.children[0].name == 'globalArrayDeclare'):
        varType = t.search_nodes(name = 'declareType')[0].children[0].name
        varName = t.search_nodes(name = 'varName')[0].children[0].children[0].name
        initValue = []
        for iv in t.search_nodes(name = 'initValue')[0].children:
            initValue.append(iv.children[0].name)
        tableContent = {}
        tableContent['varType']=varType
        tableContent['initValue']=initValue
        globalVarTable[varName]=tableContent
    elif(t.children[0].name == 'myStructDefinition'):
            labelTable_myStructDefinition(t.children[0], codeLN)
    else:
        handle_error(codeLN, sys._getframe().f_lineno, 'Unknow user code type: %s'%(t.children[i].name))
    
    
def handleGlobal(t):
    for i in range(len(t.children)):
        if(t.children[i].name == 'myNL'):
            continue
        elif(t.children[i].name == 'myDeclare'):
            global_Declare(t.children[i], findLN(t, i))
        elif(t.children[i].name == 'myFuncDefinition'):
            handleFuncDefinition(t.children[i])
        else:
            # error handle
            handle_error(findLN(t, i), sys._getframe().f_lineno, 'Unknow user code type: %s'%(t.children[i].name))
def spTableBuilding_structHandle(spTable, labelName, structName, structContent, spPosition):
    for i in range(len(spTable)):
        if(spTable[i]['index'] == spPosition):
            # triverse struct and put all struct member into spTable
            structBody = structContent['structBody']
            memberCount = 0
            j=0
            for sb in structBody:
                if(sb[0].split()[0] == 'myStruct'): # handle nested struct
                    nestedStructName = sb[0].split()[1]
                    nestedStructVarName = sb[1]
                    nestedStructContent = structTable[nestedStructName]
                    spTable, mc = spTableBuilding_structHandle(spTable, labelName+'.'+nestedStructVarName,nestedStructName, nestedStructContent, spPosition)
                    j += mc
                    #break
                else:
                    spTable[i+j]['varName'] = labelName+'.'+sb[1]
                    spPosition += 4
                    memberCount += 1
                    j += 1
            break
    return spTable, memberCount
def spTableBuilding():
    spTable = newSpTable(varCount)
    for labelName, labelContent in labelTable.items():
        #if(labelContent['labelType'] == 'var' or  labelContent['labelType'] == 'ptrVar'):
        if(labelContent['labelType']=='const'):
            # this label is a const
            continue
        elif(labelContent['contentType'] == 'int' or '*' in labelContent['contentType']): # normal var and ptr var
            spPosition = labelContent['spPosition']
            
            for s in spTable:
                if(s['index'] == spPosition):
                    s['varName'] = labelName
                    break
        #elif(labelContent['labelType'] == 'arrayVar'):
        elif('[' in labelContent['contentType']):
            arrayName = labelName
            spPosition = labelContent['spPosition']
            #arrayLen = int(labelContent['contentLen'])/4
            arrayLen = int(labelContent['contentType'][labelContent['contentType'].find('[')+1:-1])
            indexCount = 0
            for s in spTable:
                if(s['index'] == spPosition + indexCount*4):
                    s['varName'] = arrayName+'['+str(indexCount)+']'
                    indexCount += 1
                    if(indexCount >= arrayLen):
                        break
        elif('struct' in labelContent['contentType']):
            structName = labelContent['contentType'].split()[1]
            structContent = structTable[structName]
            spPos = labelContent['spPosition']
            spTable = spTableBuilding_structHandle(spTable, labelName, structName, structContent, spPos)[0]
            
    return spTable
def handleFuncDefinition(t):
    global labelTable
    global varCount
    
    progName = t.search_nodes(name='funcName')[0].children[0].name
    progBody = t.search_nodes(name='myFuncBody')[0]
    
    # handle input parameter
    inputParameter = t.search_nodes(name='myFuncInputPara')[0]
    # handle all of input parameter as declare
    for i in inputParameter.children:
        if(inputParameter.children[0].name == 'None'):
            break
        labelTable_Declare(i, findLN(progBody, 0))
    
    # handle program body
    addNewLabel2labelTable(Tree('0;', format=1), 'const', 'int', 4, 0, None, False)
    labelTable_codeBodyFilter(progBody)
    
    # handle code end
    for r in labelTable.keys():
        if(labelTable[r]['lineNoEnd']==0):
            labelTable[r]['lineNoEnd'] = labelTable[r]['lineNoBegin']
            
    # handle data format
    subProg[progName] = {'returnType':t.children[0].children[0].name}
    subProg[progName]['progBody'] = t.search_nodes(name = 'myFuncBody')[0]
    subProg[progName]['inputParameter']=t.search_nodes(name='myFuncInputPara')[0]
    subProg[progName]['labelTable'] = labelTable
    subProg[progName]['varCount'] = varCount
    subProg[progName]['maxRegUsed'] = 10
    
    # build sp table
    spTable = spTableBuilding()
    
    subProg[progName]['spTable'] = spTable
    labelTable = {}
    varCount = 0
    # handle Sub done

def labelTable_myStructDefinition(t, codeLN):
    global structTable
    structName = t.search_nodes(name = 'myStructName')[0].children[0].name
    structBody = t.search_nodes(name = 'myStructBody')[0]
    
    structBodyContent = []
    structVarCount = 0
    #structSize = 0
    for sb in structBody.children:
        if sb.name == 'myNL':
            continue
        elif(sb.name == 'myDeclare'):
            # handle declare
            varName, declareType, contentLen, declareVarCount = handle_DeclareTypes(sb, codeLN)
            structVarCount += declareVarCount
            structBodyContent.append([declareType, varName.name])
            
        else:
            handle_error(findLN(t, i), sys._getframe().f_lineno, 'Unknow code type: %s'%(sb.name))
    structTable[structName]={'varCount' : structVarCount}
    structTable[structName]['structBody'] = structBodyContent
    
## ----------------------------------------------------------------------------
## 
## Start creating tables
fin = open('ast.txt')
ast = fin.read()    # read all ast tree

# pre processing raw ANTLR output into ete3 tree format

pvt = 1
while(pvt < len(ast)):
    if(ast[pvt]=='('):
        if(ast[pvt-1]==','):
            pvt += 1
            continue
        elif(ast[pvt-1]!='('):
            ast=ast[:pvt]+','+ast[pvt:]
            pvt += 2
        else:
            pvt += 1
    else:
        pvt += 1
while('()' in ast):
    pvt = ast.find('()')
    ast = ast[:pvt+1] + 'None' +ast[pvt+1:]

# start label estimating
subProg = {}
t = Tree(ast+';', format = 1)
t.show()
# handle global
handleGlobal(t)

# table estimating done
## ==============================================================