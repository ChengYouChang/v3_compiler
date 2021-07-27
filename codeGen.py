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
    elif(t.name == 'var'):
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
    elif(t.name == 'myStructVar'):
        if(t.children[0].name == 'var'):
            varName = t.children[0].children[0].name
        elif(t.children[0].name == 'myStructVar'):
            varName = checkAndAddLabelTable(t.children[0],codeLN)
        if(varName in labelTable):
            # if this variable already in label table
            labelTable[varName]['lineNoEnd'] = codeLN
            return varName
        else:
            # error
            handle_error(codeLN, sys._getframe().f_lineno, 'variable \'%s\' not declare yet'%(varName))
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
        if(e.name == 'op' or e.name == 'cmpOp'):
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
        labelTable_Declare(forInit, findLN(forBody,0))
    elif(forInit.name == 'myExpr'):
        labelTable_Expr(forInit, findLN(forBody,0))
    elif(forInit.name == 'None'):
        pass
    else:
        handle_error(findLN(t, 0), sys._getframe().f_lineno, 'Unknow user code type: %s'%(forInit.name))
        
    # handle forCondition
    if(forCondi.name == 'None'):
        pass
    else:
        labelTable_Expr(forCondi, findLN(forBody, 0))
    
    # handle for Increment
    if(forIncrement.name == 'None'):
        pass
    else:
        labelTable_Expr(forIncrement, findLN(forBody,0))
        
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
        handle_error(codeLN, sys._getframe().f_lineno, 'Unknow user code type: %s'%(t.children[0].name))
    
    
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
            handle_error(findLN(t, 0), sys._getframe().f_lineno, 'Unknow code type: %s'%(sb.name))
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
# show AST
a=1
#t.show()
# handle global
handleGlobal(t)


'''
op2assList[OP code format(ete3 Tree), assembly code template(string template)]
OP code format: which op code and input type
    R: register   c: const
assembly code template: converte to which type of assembly code
    $inx: input number
'''
op2assList = []
# assign (=)
op2assList.append([Tree('(reg,const)=;', format = 1), 'LDI'])
op2assList.append([Tree('(reg,reg)=;', format = 1), 'MOV'])
# add (+)
op2assList.append([Tree('(const,const)+;', format = 1), 'ADD'])
op2assList.append([Tree('(reg,const)+;', format = 1), 'ADD'])
op2assList.append([Tree('(const,reg)+;', format = 1), 'ADD'])
op2assList.append([Tree('(reg,reg)+;', format = 1), 'ADD'])
# sub (-)
op2assList.append([Tree('(const,const)-;', format = 1), 'SUB'])
op2assList.append([Tree('(reg,const)-;', format = 1), 'SUB'])
op2assList.append([Tree('(const,reg)-;', format = 1), 'SUB'])
op2assList.append([Tree('(reg,reg)-;', format = 1), 'SUB'])
# multiple (*)
op2assList.append([Tree('(const,const)*;', format = 1), 'MUL'])
op2assList.append([Tree('(reg,const)*;', format = 1), 'MUL'])
op2assList.append([Tree('(const,reg)*;', format = 1), 'MUL'])
op2assList.append([Tree('(reg,reg)*;', format = 1), 'MUL'])
# divide (/)
op2assList.append([Tree('(const,const)/;', format = 1), 'DIV'])
op2assList.append([Tree('(reg,const)/;', format = 1), 'DIV'])
op2assList.append([Tree('(const,reg)/;', format = 1), 'DIV'])
op2assList.append([Tree('(reg,reg)/;', format = 1), 'DIV'])
# remainder (%)
op2assList.append([Tree('(const,const)%;', format = 1), 'RMD'])
op2assList.append([Tree('(reg,const)%;', format = 1), 'RMD'])
op2assList.append([Tree('(const,reg)%;', format = 1), 'RMD'])
op2assList.append([Tree('(reg,reg)%;', format = 1), 'RMD'])
# and (&)
op2assList.append([Tree('(const,const)&;', format = 1), 'AND'])
op2assList.append([Tree('(reg,const)&;', format = 1), 'AND'])
op2assList.append([Tree('(const,reg)&;', format = 1), 'AND'])
op2assList.append([Tree('(reg,reg)&;', format = 1), 'AND'])
# xor (^)
op2assList.append([Tree('(const,const)^;', format = 1), 'XOR'])
op2assList.append([Tree('(reg,const)^;', format = 1), 'XOR'])
op2assList.append([Tree('(const,reg)^;', format = 1), 'XOR'])
op2assList.append([Tree('(reg,reg)^;', format = 1), 'XOR'])
# or (|)
op2assList.append([Tree('(const,const)|;', format = 1), 'OR'])
op2assList.append([Tree('(reg,const)|;', format = 1), 'OR'])
op2assList.append([Tree('(const,reg)|;', format = 1), 'OR'])
op2assList.append([Tree('(reg,reg)|;', format = 1), 'OR'])
# ==
op2assList.append([Tree('(reg,reg)==;', format = 1), 'CMP'])
op2assList.append([Tree('(reg,const)==;', format = 1), 'CMP'])
op2assList.append([Tree('(const,reg)==;', format = 1), 'CMP'])
op2assList.append([Tree('(const,const)==;', format = 1), 'CMP'])
# !=
op2assList.append([Tree('(reg,reg)!=;', format = 1), 'CMP'])
op2assList.append([Tree('(reg,const)!=;', format = 1), 'CMP'])
op2assList.append([Tree('(const,reg)!=;', format = 1), 'CMP'])
op2assList.append([Tree('(const,const)!=;', format = 1), 'CMP'])
# >
op2assList.append([Tree('(reg,reg)>;', format = 1), 'CMP'])
op2assList.append([Tree('(reg,const)>;', format = 1), 'CMP'])
op2assList.append([Tree('(const,reg)>;', format = 1), 'CMP'])
op2assList.append([Tree('(const,const)>;', format = 1), 'CMP'])
# <
op2assList.append([Tree('(reg,reg)<;', format = 1), 'CMP'])
op2assList.append([Tree('(reg,const)<;', format = 1), 'CMP'])
op2assList.append([Tree('(const,reg)<;', format = 1), 'CMP'])
op2assList.append([Tree('(const,const)<;', format = 1), 'CMP'])
# >=
op2assList.append([Tree('(reg,reg)>=;', format = 1), 'CMP'])
op2assList.append([Tree('(reg,const)>=;', format = 1), 'CMP'])
op2assList.append([Tree('(const,reg)>=;', format = 1), 'CMP'])
op2assList.append([Tree('(const,const)>=;', format = 1), 'CMP'])
# <=
op2assList.append([Tree('(reg,reg)<=;', format = 1), 'CMP'])
op2assList.append([Tree('(reg,const)<=;', format = 1), 'CMP'])
op2assList.append([Tree('(const,reg)<=;', format = 1), 'CMP'])
op2assList.append([Tree('(const,const)<=;', format = 1), 'CMP'])

# =============================================================================

# 2nd scan: code generation

# =============================================================================

'''
Start building register table
reg (dictionary): [Rx: content]
Rx: register number
content: register content(variable or const)
'''
regMax = 11  # Max number of registers

reg = {}
reg['R0'] = '0'
for i in range(1,regMax):
    reg['R'+str(i)] = ''

def findReg(varName, subProgName):
    '''
        string findReg(varName: string, subProgName: string)
        find register number from an unknow variable name
        
        varName: variable that I want to find (string)
        subProgName: variable's sub program name
    '''
    if('[' in varName):
        return False
    else:
        for R, content in reg.items():
            if(reg[R] == varName):
                return R
    
    return False

# -----------------------------------------------------------------------------
def makeLabelLive(label, subProgName):
    '''
        string makeLabelLive(label: string, subProgName: string)
        find empty register to contain live label
        
        label: label that I want to make it live (string)
        subProgName: variable's sub program name
        return: register name
    '''
    # find empty register to contain live label
    labelTable = subProg[subProgName]['labelTable']
    if('%tmp' not in label):
        labelTable[label]['liveable'] = True
    else:
        # make tmp var live in register
        for i in range(regMax-1, 1, -1):
            if(reg['R'+str(i)] == ''):
                reg['R'+str(i)] = label
                return 'R'+str(i)
    for i in range(regMax-1, 1, -1):
        if(reg['R'+str(i)] == ''):
            reg['R'+str(i)] = label
            return 'R'+str(i)
    handle_error(None, sys._getframe().f_lineno, 'Error: register is full!')
    return False

def mappingop2assList(op2assList, exprOp, opLeft, opRight):
    # check if this op in op list
    if(op2assList.name != exprOp.name):
        return False
    
    regTypeCode = ['var', 'myArrayVar', 'myStructVar', 'varAddr', 'tmpReg', 'addrContent', 'myCasting', 'myFuncCall']
    
    if(opLeft.name in regTypeCode):
        tLType = 'reg'
    elif(opLeft.name == 'intConst'):
        tLType = 'const'
    else:
        handle_error(None, sys._getframe().f_lineno, 'Something is wrong: '+opLeft.name)
        
    if(opRight.name in regTypeCode):
        tRType = 'reg'
    elif(opRight.name == 'intConst'):
        tRType = 'const'
    else:
        handle_error(None, sys._getframe().f_lineno, 'Something is wrong: '+opRight.name)
        
    op2assListLType = op2assList.children[0].name
    op2assListRType = op2assList.children[1].name
    if(op2assListLType == tLType and op2assListRType == tRType):
        return True
    else:
        return False
    '''
    if(t.children[0].name == 'int'):
        tLType = 'const'
    elif(t.children[0].name == 'var'):
        tLType = 'reg'
    elif(t.children[0].name == 'arrayVar'):
        tLType = 'reg'
    elif(t.children[0].name == 'myExpr'):
        tLType = 'reg'
    elif(t.children[0].name == 'mySubVar'):
        tLType = 'reg'
    elif(len(t.children[0].search_nodes(name='tmpReg')) > 0):
        tLType = 'reg'
    elif(t.children[0].name == 'addrContent'):
        tLType = 'reg'
    elif(t.children[0].name == 'myStructVar'):
        tLType = 'reg'
    else:
        handle_error(None, sys._getframe().f_lineno, 'Something is wrong: '+t.children[0].name)

    if(t.children[2].name == 'int'):
        tRType = 'const'
    elif(t.children[2].name == 'var'):
        tRType = 'reg'
    elif(t.children[2].name == 'arrayVar'):
        tRType = 'reg'
    elif(t.children[2].name == 'myExpr'):
        tRType = 'reg'
    elif(t.children[2].name == 'mySubVar'):
        tRType = 'reg'
    elif(len(t.children[2].search_nodes(name='tmpReg')) > 0):
        tRType = 'reg'
    elif(t.children[2].name == 'addrContent'):
        tRType = 'reg'
    elif(t.children[2].name == 'myStructVar'):
        tRType = 'reg'
    else:
        handle_error(None, sys._getframe().f_lineno, 'Something is wrong: '+t.children[2].name)
    
    if(op2assListLType == tLType and op2assListRType == tRType):
        return True
    else:
        return False
    '''
    
# -----------------------------------------------------------------------------
def st2Sp(varName, stReg):
    # if var is global var
    if(varName in globalVarTable):
        assCodeAppend('ST %s R0 %s'%(stReg, varName))
    # find the sp index of varName
    for s in spTable:
        if(s['varName'] == varName):
            assCodeAppend('ST %s SP %s'%(stReg, s['index']))
            return True
    handle_error(None, sys._getframe().f_lineno, 'Wrong var to store: '+varName)
    return False
        
    
def ld2Reg(varName, ldReg):
    # find the sp index of varName
    for s in spTable:
        if(s['varName'] == varName):
            assCodeAppend('LD %s SP %s'%(ldReg, s['index']))
            return True
    return False
    
# -----------------------------------------------------------------------------
    
tmpNum=0
def newTmp():
    '''
        string newTmp()
        create a tmperary cariable to contain the temp result
        
        return: tmp name (string)
    '''
    global tmpNum
    newTmp = '%tmp'+str(tmpNum)
    tmpNum += 1
    return newTmp

def freeTmpReg(tmpReg):
    '''
        boolean freeTmpReg(tmpReg: string)
        free tmp variable in register tablle
        
        tmpReg: the tmp register I want to  free
        return: free success or not (boolean)
    '''
    global tmpNum
    if('%tmp' not in tmpReg):
        if(not tmpReg.lstrip('-').isdigit()):
            return
        else:
            for R, content in reg.items():
                if(R == 'R0'):
                    continue
                if(tmpReg == content):
                    reg[R] = ''
                    return True
    for R, content in reg.items():
        if(tmpReg == content):
            reg[R] = ''
            #tmpNum = tmpNum - 1
            return True

# -----------------------------------------------------------------------------
'''
    assembly code label
'''
assLabelNum=0

def newAssLabel():
    '''
        assign a new label in assembly code
    '''
    global assLabelNum
    assLabelNum += 1
    return ('L.%i'%assLabelNum)
# -----------------------------------------------------------------------------
ass = ''
def assCodeAppend(assCode):
    '''
        None assCodeAppend(assCode)
        add assembly code to result
        
        assCode: the assembly code I want to append
        return: None
    '''
    global ass
    ass += assCode + '\n'    

def valueCalculate(in1, op_, in2):
    in1 = int(reg[in1][0])
    in2 = int(reg[in2][0])
    if(op_ == '+'):
        return operator.add(in1, in2)
    elif(op_ == '-'):
        return operator.sub(in1, in2)
    elif(op_ == '*'):
        return operator.mul(in1, in2)
    elif(op_ == '/'):
        return operator.truediv(in1, in2)
    elif(op_ == '%'):
        return operator.mod(in1, in2)
    elif(op_ == '&'):
        return operator.and_(in1, in2)
    elif(op_ == '^'):
        return operator.xor(in1, in2)
    elif(op_ == '|'):
        return operator.or_(in1, in2)
    elif(op_ == '>'):
        return operator.gt(in1, in2)
    elif(op_ == '>='):
        return operator.ge(in1, in2)
    elif(op_ == '<'):
        return operator.lt(in1, in2)
    elif(op_ == '<='):
        return operator.le(in1, in2)
    elif(op_ == '=='):
        return operator.eq(in1, in2)
    elif(op_ == '!='):
        return operator.ne(in1, in2)
    else:
        handle_error(None, sys._getframe().f_lineno, 'Undefine op: '+op_)
    

# start creating assembly code
def declare2ass(t, subProgName, codeLN):
    '''
        None declare2ass(t: ete3 tree, subProgName: string)
        handle user code (declare type) and transfer to assembly code
        
        assCode: the assembly code I want to append
        return: None
    '''
    labelTable = subProg[subProgName]['labelTable']
    varName = t.search_nodes(name='var')[0].children[0].name
    
    if(varName in labelTable):
        labelTable[varName]['liveable'] = True
        return True
    else:
        handle_error(codeLN, sys._getframe().f_lineno, 'Generate assembly code error(declare type): '+varName)

def storeReg2Var(assignLeft, assignLeftTmp, assignLeftReg, subProgName, codeLN):
    if('%tmp' in assignLeft.name):
        return True
    elif(assignLeft.name == 'var'):
        ## normal var
        varName = assignLeft.children[0].name
        st2Sp(varName, assignLeftReg)
        freeTmpReg(assignLeftTmp)
    elif(assignLeft.name == 'myArrayVar'):
        ## array var
        # find array sp index
        arrayIndex = assignLeft.search_nodes(name = 'arrayIndex')[0].children[0]
        arrayName = assignLeft.search_nodes(name = 'arrayName')[0].children[0].name
        #handle array index to a register
        opCode, regLeft, regRight = expr2ass(arrayIndex, subProgName, codeLN)
        arrayIndexTmp = newTmp()
        arrayIndexReg = makeLabelLive(arrayIndexTmp, subProgName)
        assCodeAppend(opCode+' '+arrayIndexReg+' '+regLeft+' '+regRight)
        # arrayOffsetReg <= index<<2
        assCodeAppend("SHL %s %s 2"%(arrayIndexReg, arrayIndexReg))
        # if arrayVar is global var
        if(arrayName in globalVarTable):
            assCodeAppend("ST %s %s %s"%(assignLeftReg, arrayIndexReg, arrayName))
            freeTmpReg(arrayIndexTmp)
            freeTmpReg(assignLeftTmp)
        else:
            # find array start SP index
            for SP in spTable:
                if(SP['varName'] == arrayName+'[0]'):
                    spIndex = SP['index']
                    break
            # find array[0] sp position, array0SpReg <= a[0].sp
            array0Sp = newTmp()
            array0SpReg = makeLabelLive(array0Sp, subProgName)
            assCodeAppend("LDI %s SP %s"%(array0SpReg, spIndex))  # sp[0].index
            # STR R3, R1, R2
            assCodeAppend("STR %s %s %s"%(assignLeftReg, arrayIndexReg, array0SpReg))  # sp[0].index
            #freeTmpReg(assignTmp)
            freeTmpReg(arrayIndexTmp)
            freeTmpReg(array0Sp)
            freeTmpReg(assignLeftTmp)
    elif(assignLeft.name == 'addrContent'):
        ## address content
        # *ptr = 2
        opCode, reg1, reg2 = expr2ass(assignLeft, subProgName, codeLN)
        assCodeAppend('STR %s %s %s'%(assignLeftReg, reg1, reg2))
        #assCodeAppend('STR'+' '+assignLeftReg+' '+'R0'+' '+ptrReg)
        freeTmpReg(reg[reg2])
        freeTmpReg(assignLeftTmp)
    elif(assignLeft.name == 'myStructVar'):
        # struct var
        varName = assignLeft.search_nodes(name = 'var')[0].children[0].name
        ## if it is nested
        structMemberName = ''
        assignLeftChildren = assignLeft.children[0]
        while(assignLeftChildren.name != 'var'):
            varName += '.'+assignLeftChildren.search_nodes(name = 'myStructMember')[0].children[0].children[0].name
            assignLeftChildren = assignLeftChildren.children[0]
        structMemberName = assignLeft.search_nodes(name = 'myStructMember')[0].children[0].name
        varName += '.'+structMemberName
        st2Sp(varName, assignLeftReg)
        freeTmpReg(assignLeftTmp)
    else:
        handle_error(codeLN, sys._getframe().f_lineno, 'Unknow Variable type')

def expr2ass(t, subProgName, codeLN):
    '''
    There are 2 kinds of expr needed to handle
    Type 1: var or intConst
    Type 2: with op, ex: op e1, e2
    '''
    labelTable = subProg[subProgName]['labelTable']
    spTable = subProg[subProgName]['spTable']
    # handle expr in type 1
    if(len(t.children) == 1):
        # handle int
        if(t.name == 'intConst'):
            return 'LDI', 'R0', t.children[0].name
        # handle variable
        elif(t.name == 'var'):
            ## if var is global var
            if(t.children[0].name in globalVarTable):
                varName = t.children[0].name
                return 'LD', 'R0', varName
            ## find and return sp index
            for s in spTable:
                if(s['varName'] == t.children[0].name):
                    return 'LD', 'SP', str(s['index'])
            # arrayVar addr
            if(labelTable[t.children[0].name]['labelType'] == 'arrayVar'):
                return 'LDI', 'SP', str(labelTable[t.children[0].name]['spPosition'])
            else:
                handle_error(codeLN, sys._getframe().f_lineno, 'Unknow code: %s'%(t.children[0].name))
            
        elif(t.name == 'varAddr'):
            # get the address of variable
            for s in spTable:
                if(s['varName'] == t.search_nodes(name='var')[0].children[0].name):
                    return 'LDI', 'SP', str(s['index'])
                elif(s['varName'].split('.')[0] == t.search_nodes(name='var')[0].children[0].name):
                    return 'LDI', 'SP', str(s['index'])
        elif(t.name == 'addrContent'):
            opCode, reg1, reg2 =  expr2ass(t.children[0], subProgName, codeLN)
            ptrTmp = newTmp()
            ptrReg = makeLabelLive(ptrTmp, subProgName)
            assCodeAppend("%s %s %s %s"%(opCode, ptrReg, reg1, reg2))
            exprFreeTmp(t.children[0], reg1, reg2, subProgName, codeLN)
            return "LDR", 'R0', ptrReg
            
        else:
            handle_error(codeLN, sys._getframe().f_lineno, 'Unknow code: %s'%(t.children[0].name))
    elif(t.name == 'myArrayVar'):
        # handle array variable
        # LD arrayVar in regRight
        arrayName = t.search_nodes(name = 'arrayName')[0].children[0].name
        arrayIndex = t.search_nodes(name = 'arrayIndex')[0].children[0]
        
        # handle array index to a register
        arrayIndexOp, reg1, reg2 = expr2ass(arrayIndex, subProgName, codeLN)
        arrayIndexTmp = newTmp()
        arrayIndexReg = makeLabelLive(arrayIndexTmp, subProgName)
        assCodeAppend(arrayIndexOp+' '+arrayIndexReg+' '+reg1+' '+reg2)
        exprFreeTmp(t, reg1, reg2, subProgName, codeLN)
        # arrayOffsetReg <= index<<2
        assCodeAppend("SHL %s %s 2"%(arrayIndexReg, arrayIndexReg))
        
        # if arrayVar is global var
        if(arrayName in globalVarTable):
            return 'LD', arrayIndexReg, arrayName
        else:
            # array0SpReg <= a[0].sp
            array0Sp = newTmp()
            array0SpReg = makeLabelLive(array0Sp, subProgName)
            # find array start SP index
            for SP in spTable:
                if(SP['varName'] == arrayName+'[0]'):
                    spIndex = SP['index']
                    break
            assCodeAppend("LDI %s SP %s"%(array0SpReg, spIndex))  # sp[0].index
            return "LDR", arrayIndexReg, array0SpReg
    elif(t.name == 'myStructVar'):
        myStructMember = t.search_nodes(name = 'myStructMember')[0].children[0].name
        varName = t.search_nodes(name='var')[0].children[0].name + '.' + myStructMember
        for s in spTable:
            if(s['varName'] == varName):
                return 'LD', 'SP', str(s['index'])
    elif(t.name == 'myFuncCall'):
        return myFuncCall2ass(t, subProgName, codeLN)
    elif(t.name == 'myCasting'):
        return expr2ass(t.children[1], subProgName, codeLN)
    
    # handle expr in type 2 (op, e1, e2)
    exprOp = t.children[0].children[0]
    opLeft = t.children[1]
    opRight = t.children[2]
    
    if(opLeft.name == 'myExpr'):
        # handle opLeft (expr)
        opCode, reg1, reg2 = expr2ass(opLeft, subProgName, codeLN)
        opLeftTmp = newTmp()
        opLeftReg = makeLabelLive(opLeftTmp, subProgName)
        assCodeAppend('%s %s %s %s'%(opCode, opLeftReg, reg1, reg2))
        exprFreeTmp(opLeft, reg1, reg2, subProgName, codeLN)
        # prune the expr to a small tree (tmp)
        opLeft = Tree('(%s)tmpReg;'%(opLeftTmp), format = 1)
        
    if(opRight.name == 'myExpr'):
        # handle opRight (expr)
        opCode, reg1, reg2 = expr2ass(opRight, subProgName, codeLN)
        opRightTmp = newTmp()
        opRightReg = makeLabelLive(opRightTmp, subProgName)
        assCodeAppend('%s %s %s %s'%(opCode, opRightReg, reg1, reg2))
        exprFreeTmp(opRight, reg1, reg2, subProgName, codeLN)
        # prune the expr to a small tree (tmp)
        opRight = Tree('(%s)tmpReg;'%(opRightTmp), format = 1)

    for i in range(len(op2assList)):
        # mapping op2assLists
        if(mappingop2assList(op2assList[i][0], exprOp, opLeft, opRight)):
            # mapped!
            exprOpAss = op2assList[i][1]
            if(exprOp.name != '='):
                # handle opRight
                if(opLeft.name == 'tmpReg'):
                    opLeftReg = findReg(opLeft.children[0].name, subProgName)
                else:
                    opCode, reg1, reg2 = expr2ass(opLeft, subProgName, codeLN)
                    opLeftTmp = newTmp()
                    opLeftReg = makeLabelLive(opLeftTmp, subProgName)
                    assCodeAppend('%s %s %s %s'%(opCode, opLeftReg, reg1, reg2))
                    exprFreeTmp(opLeft, reg1, reg2, subProgName, codeLN)
                
                # handle opRight
                if(opRight.name == 'tmpReg'):
                    opRightReg = findReg(opRight.children[0].name, subProgName)
                else:
                    opCode, reg1, reg2 = expr2ass(opRight, subProgName, codeLN)
                    opRightTmp = newTmp()
                    opRightReg = makeLabelLive(opRightTmp, subProgName)
                    assCodeAppend('%s %s %s %s'%(opCode, opRightReg, reg1, reg2))
                    exprFreeTmp(opRight, reg1, reg2, subProgName, codeLN)
                return exprOpAss, opLeftReg, opRightReg
            else:
                # handle assign
                # handle opRight
                if(opRight.name == 'tmpReg'):
                    opRightTmp = opRight.children[0].name
                    opRightReg = findReg(opRight.children[0].name , subProgName)
                else:
                    opCode, reg1, reg2 = expr2ass(opRight, subProgName, codeLN)
                    opRightTmp = newTmp()
                    opRightReg = makeLabelLive(opRightTmp, subProgName)
                    assCodeAppend('%s %s %s %s'%(opCode, opRightReg, reg1, reg2))
                    exprFreeTmp(opRight, reg1, reg2, subProgName, codeLN)
                # handle op right done, now storing to variable (SP)
                storeReg2Var(opLeft, opRightTmp, opRightReg, subProgName, codeLN)
                return True

def exprFreeTmp(t, reg1, reg2, subProgName, codeLN):
    NoNeed2Free = ['intConst', 'var', 'myFuncCall', 'varAddr', 'myStructVar', 'myCasting']
    if(t.name in NoNeed2Free):
        pass
    elif(t.name =='addrContent'):
        freeTmpReg(reg[reg2])
    else:
        if(reg1 not in globalVarTable):
            freeTmpReg(reg[reg1])
        if(reg2 not in globalVarTable):
            freeTmpReg(reg[reg2])
        
def return2ass(t, subProgName, codeLN):
    '''
        None return2ass(t: ete3 tree, subProgName: string)
        handle user code (return type) and transfer to assembly code
        
        assCode: the assembly code I want to append
        return: None
    '''
    returnValue = t.search_nodes(name='myReturn')[0].children[0]
    
    opCode, reg1, reg2 = expr2ass(returnValue, subProgName, codeLN)
    assCodeAppend(opCode+' R'+str(regMax)+' '+reg1+' '+reg2)  # sp[0].index
    exprFreeTmp(returnValue, reg1, reg2, subProgName, codeLN)
    
def jmpRule(t ,label, codeLN):
    if(t.name == 'None'):
        assCodeAppend('JMP %s'%label)
    elif(len(t.children)==0):
        assCodeAppend('JEQ %s'%label)
    else:
        condiOp = t.search_nodes(name='cmpOp')[0].children[0].name
        if(condiOp == '=='):
            assCodeAppend('JEQ %s'%label)
        elif(condiOp == '!='):
            assCodeAppend('JNE %s'%label)
        elif(condiOp == '<'):
            assCodeAppend('JLT %s'%label)
        elif(condiOp == '<='):
            assCodeAppend('JLE %s'%label)
        elif(condiOp == '>'):
            assCodeAppend('JGT %s'%label)
        elif(condiOp == '>='):
            assCodeAppend('JGE %s'%label)
        else:
            handle_error(codeLN, sys._getframe().f_lineno, 'Error type of code: %s '%(t.name))

def handleCondition(t, subProgName, codeLN):
    t = t.children[0]
    # handle condition
    if(len(t.search_nodes(name = 'cmpOp'))>0):
        # handle compare op
        opLeft = t.children[1]
        opCode, reg1, reg2 = expr2ass(opLeft, subProgName, codeLN)
        opLeftTmp = newTmp()
        opLeftReg = makeLabelLive(opLeftTmp, subProgName)
        assCodeAppend('%s %s %s %s'%(opCode, opLeftReg, reg1, reg2))
        exprFreeTmp(opLeft, reg1, reg2, subProgName, codeLN)
        
        opRight = t.children[2]
        opCode, reg1, reg2 = expr2ass(opRight, subProgName, codeLN)
        opRightTmp = newTmp()
        opRightReg = makeLabelLive(opRightTmp, subProgName)
        assCodeAppend('%s %s %s %s'%(opCode, opRightReg, reg1, reg2))
        exprFreeTmp(opRight, reg1, reg2, subProgName, codeLN)
        
        assCodeAppend('CMP %s %s'%(opLeftReg, opRightReg))
        freeTmpReg(opLeftTmp)
        freeTmpReg(opRightTmp)
    else:
        # handle normal expr op
        opCode, reg1, reg2 = expr2ass(t, subProgName, codeLN)
        condiTmp = newTmp()
        condiReg = makeLabelLive(condiTmp, subProgName)
        assCodeAppend('%s %s %s %s'%(opCode, condiReg, reg1, reg2))
        exprFreeTmp(t, reg1, reg2, subProgName, codeLN)
        assCodeAppend('CMP %s R0'%(condiReg))
        freeTmpReg(condiTmp)
    # handle if confition done
    
def selection2ass(t, subProgName, codeLN):
    ifCondi = t.search_nodes(name = 'ifCondi')[0].children[0]
    ifCodeBody = t.search_nodes(name = 'ifBody')[0]
    if(t.search_nodes(name = 'elseBody') == []):
        elseCodeBody = None
    else:
        elseCodeBody = t.search_nodes(name = 'elseBody')[0]
    
    handleCondition(ifCondi, subProgName, codeLN)
    
    # assign labels
    elseCodeLabel = newAssLabel()
    if(elseCodeBody == None):
        # if else code body doesn't exist
        outLabel = elseCodeLabel
    else:
        outLabel = newAssLabel()
    
    # handle assembly code label
    if(len(ifCondi.search_nodes(name='op')) == 0):
        assCodeAppend('JEQ %s'%elseCodeLabel)
    else:
        ifCondiOp = ifCondi.search_nodes(name='op')[0].children[0].name
        if(ifCondiOp == '=='):    
            assCodeAppend('JNE %s'%elseCodeLabel)
        elif(ifCondiOp == '!='):    
            assCodeAppend('JEQ %s'%elseCodeLabel)
        elif(ifCondiOp == '>'):    
            assCodeAppend('JLE %s'%elseCodeLabel)
        elif(ifCondiOp == '<'):    
            assCodeAppend('JGE %s'%elseCodeLabel)
        elif(ifCondiOp == '>='):    
            assCodeAppend('JLT %s'%elseCodeLabel)
        elif(ifCondiOp == '<='):    
            assCodeAppend('JGT  %s'%elseCodeLabel)
        elif(ifCondiOp in ops):
            assCodeAppend('JEQ %s'%elseCodeLabel)
        else:
            handle_error(codeLN, sys._getframe().f_lineno, 'Unknow user code type: %s'%(ifCondi.children[1].name))     
            
    # handle if code body
    progBodyFilter(ifCodeBody, subProgName)
    assCodeAppend('JMP %s'%outLabel)
    
    # handle else code body
    if(elseCodeBody == None):
        pass
    else:
        assCodeAppend(elseCodeLabel+':')
        progBodyFilter(elseCodeBody, subProgName)
    
    # IF code body done, out of the IF
    assCodeAppend(outLabel+':')
    
def iteration2ass(t, subProgName, codeLN):
    forInit = t.search_nodes(name = 'forInit')[0]
    forCondi = t.search_nodes(name = 'forCondi')[0]
    forIncrement = t.search_nodes(name = 'forIncrement')[0]
    forBody = t.search_nodes(name = 'forBody')[0]
    '''
        -- The flow of for loop --
        Init
        goto L_condi
        L_body: for body
        increment
        L_condi: if for condition != 0, goto L_body
        L_out: out of for
    '''
    # create labels
    L_condi = newAssLabel()
    L_body = newAssLabel()
    L_out = newAssLabel() 
    
    # handle FOR init
    for i in range(len(forInit.children)):
        if(forInit.children[i].name == 'myDeclare'):
            declare2ass(forInit.children[i], subProgName, findLN(t, 0))
        elif(forInit.children[i].name == 'myExpr'):
            expr2ass(forInit.children[i], subProgName, findLN(forBody, 0))
        elif(forInit.children[i].name == 'None'):
            pass
        else:
            handle_error(findLN(t, 0), sys._getframe().f_lineno, 'Unknow code type in for initialize: %s'%(forInit.children[i].name))   

    # JMP L_condi
    assCodeAppend('JMP %s'%(L_condi))
    
    # handle FOR body
    assCodeAppend('%s:'%(L_body))
    progBodyFilter(forBody, subProgName)
    
    # handle FOR Increment
    for i in range(len(forIncrement.children)):
        if(forIncrement.children[i].name == 'myExpr'):
            expr2ass(forIncrement.children[i], subProgName, findLN(forBody, 0))
        elif(forIncrement.children[i].name == 'None'):
            pass
        else:
            handle_error(findLN(t, 0), sys._getframe().f_lineno, 'Unknow code type in for increment: %s'%(forIncrement.name))
    
    assCodeAppend('%s:'%(L_condi))
    handleCondition(forCondi, subProgName, codeLN)
    jmpRule(forCondi, L_body, codeLN)
    
    # L_out
    assCodeAppend('%s:'%(L_out))
    
def myFuncCall2ass(t, subProgName, codeLN):
    '''
        None myFuncCall2ass(t: ete3 tree, subProgName: string)
        handle user code (return type) and transfer to assembly code
        
        assCode: the assembly code I want to append
        return: None
    '''
    mySubName = t.search_nodes(name ='myFuncName')[0].children[0]
    inputPm = t.search_nodes(name ='inputPara')[0]
    # check if in global table
    if(mySubName.name not in subProg):
        handle_error(codeLN, sys._getframe().f_lineno, 'Sub program(function) error: %s'%(mySubName.name))
    # handle input parameter
    if(inputPm.children[0].name == "None"):
        pass
    else:
        for i in range(len(inputPm.children)):
            opCode, reg1, reg2 = expr2ass(inputPm.children[i], subProgName, codeLN)
            assCodeAppend("%s %s %s %s"%(opCode, "R"+str(i+1), reg1, reg2))
            exprFreeTmp(inputPm.children[i], reg1, reg2, subProgName, codeLN)
    assCodeAppend('CALL %s'%mySubName.name)
    return 'LDI', 'R11', 0

def progBodyFilter(t, subProgName):
    for i in range(len(t.children)):
        if(t.children[i].name == 'myNL' or t.children[i].name =='None'):
            continue
        elif(t.children[i].name == 'myDeclare'):
            declare2ass(t.children[i], subProgName, findLN(t, i))
        elif(t.children[i].name == 'myExpr'):
            expr2ass(t.children[i], subProgName, findLN(t, i))
        elif(t.children[i].name == 'myReturn'):
            return2ass(t.children[i], subProgName, findLN(t, i))
        elif(t.children[i].name == 'mySelection'):
            selection2ass(t.children[i], subProgName, findLN(t, i))
        elif(t.children[i].name == 'myIteration'):
            iteration2ass(t.children[i], subProgName, findLN(t, i))
        elif(t.children[i].name == 'myFuncCall'):
            myFuncCall2ass(t.children[i], subProgName, findLN(t, i))
        else:
            handle_error(findLN(t, i), sys._getframe().f_lineno, 'Unknow user code type: %s'%(t.children[i].name))
    #local variable not done

def myFuncDefinition2ass(t):
    global spTable
    subProgName = t.search_nodes(name="funcName")[0].children[0].name
    '''
    # add some init assembly code 
    assCodeAppend('.global '+subProgName)
    assCodeAppend('.text')
    '''
    assCodeAppend(subProgName + ':')
    labelTable = subProg[subProgName]['labelTable']
    labelTable['0']['liveable'] = True

    # push all Reg into stack
    for i in range(subProg[subProgName]['maxRegUsed'], 0, -1):
        assCodeAppend('PUSH %s'%('R'+str(i)))
    
    # change SP for containing var
    varCount = subProg[subProgName]['varCount']
    '''
    # labels
    assCodeAppend('.frame SP, '+str(varCount*4))
    '''
    pushSpTmpReg = 'R10'
    assCodeAppend('LDI %s R0 %s'%(pushSpTmpReg, str(varCount*-4)))
    assCodeAppend('ADD SP SP %s'%(pushSpTmpReg))
    spTable = subProg[subProgName]['spTable']
    
    # input parameter declare
    for i in subProg[subProgName]['inputParameter'].children:
        if(i.name == 'None'):
            break
        declare2ass(i, subProgName, 0)
    
    # store input parameter into local variable
    for i in range(len(subProg[subProgName]['inputParameter'].children)):
        if(subProg[subProgName]['inputParameter'].children[0].name == 'None'):
            break
        stReg = 'R'+str(i+1)
        spIndex = str(i*4)
        assCodeAppend('ST %s SP %s'%(stReg, spIndex))
    
    # handle program body
    progBodyFilter(subProg[subProgName]['progBody'], subProgName)
    
    # push SP back
    subProgEndLabel = newAssLabel()
    assCodeAppend(subProgEndLabel+":")
    
    pushBackSp = newTmp()
    pushBackSpReg = makeLabelLive(pushBackSp, subProgName)
    assCodeAppend('LDI %s R0 %i'%(pushBackSpReg, varCount*4))
    assCodeAppend('ADD SP SP %s'%(pushBackSpReg))
    freeTmpReg(pushBackSp)
    
    # pop all Reg from stack
    for i in range(subProg[subProgName]['maxRegUsed']):
        assCodeAppend('POP %s'%('R'+str(i+1)))
    
    # add RET
    if('ISR_' in subProgName):
        assCodeAppend('IRET')    
    else:
        assCodeAppend('RET')

def globalVar2ass(t):
    global globalVarTable
    if(t.children[0].name == 'globalDeclare'):
        varName = t.search_nodes(name = 'varName')[0].children[0].children[0].name
        assCodeAppend('.global '+varName)
        assCodeAppend('.data')
        globalVarContent = globalVarTable[varName]
        if(globalVarContent['varType'] == 'int'):
            assCodeAppend(varName+': word '+globalVarContent['initValue'])
        else:
            handle_error(findLN(t, i), sys._getframe().f_lineno, 'Unknow user code type: %s'%(t.children[0].name))
            
    elif(t.children[0].name == 'globalArrayDeclare'):
        varName = t.search_nodes(name = 'varName')[0].children[0].children[0].name
        '''
        assCodeAppend('.global '+varName)
        assCodeAppend('.data')
        '''
        globalVarContent = globalVarTable[varName]
        if(globalVarContent['varType'] == 'int'):
            assCodeAppend(varName+':')
            for iv in globalVarContent['initValue']:
                assCodeAppend('word '+iv)
        else:
            handle_error(findLN(t, i), sys._getframe().f_lineno, 'Unknow user code type: %s'%(t.children[0].name))
    elif(t.children[0].name == 'myStructDefinition'):
        return
    else:
        handle_error(findLN(t, i), sys._getframe().f_lineno, 'Unknow user code type: %s'%(t.children[0].name))

## ----------------------------------------------------------------
# start code generation
t = Tree(ast+';', format = 1)

for i in range(len(t.children)):
    if(t.children[i].name == 'myNL'):
        continue
    elif(t.children[i].name == 'myFuncDefinition'):
        myFuncDefinition2ass(t.children[i])
    elif(t.children[i].name == 'myDeclare'):
        globalVar2ass(t.children[i])
    else:
        handle_error(findLN(t, i), sys._getframe().f_lineno, 'Unknow user code type: %s'%(t.children[i].name))

## ----------------------------------------------------------------
# code generation done, save the assembly code
fin.close()
assOut = open('ass.s','w')
assOut.write(ass)
assOut.close()
print('Assembly code generate success !')
