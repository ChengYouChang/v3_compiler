grammar v3_compiler;

@parser::members{
nl_count=0;
}
// Parser Rules
globalSpace returns[finalAST = '']
    :   {$finalAST += '('}
    (g=myGlobalCode
        {$finalAST += '%s'%($g.myGlobalAST)})*
        {$finalAST += ')myGlobal'}
    ;
myGlobalCode returns[myGlobalAST = '']
    : d=myDeclare Semi
        {$myGlobalAST += '(%s)myDeclare'%($d.myDeclareAST)}
    | myFuncDefinition
        {$myGlobalAST += '(%s)myFuncDefinition'%($myFuncDefinition.myFuncDefinitionAST)}
    | myNL
        {$myGlobalAST += '%s'%($myNL.myNLAST)}
    ;

myDeclare returns[myDeclareAST='']
    :// normal declaration
    // int x; int *ptr; int x=3, y, *z;
    myType 
        {$myDeclareAST += '((%s'%($myType.myTypeAST)}
    (Star
        {$myDeclareAST += '*'})* 
    id1=ID 
        {$myDeclareAST += ')type,(%s)var)myDeclare'%($id1.text)}
    (Assign myExpr
        {$myDeclareAST += '((=)op,(%s)var,%s)myEpxer'%($id1.text, $myExpr.myExprAST)})?
    (Comma 
        {$myDeclareAST += '((%s'%($myType.myTypeAST)}
    (Star
        {$myDeclareAST += '*'})* 
    id2=ID 
        {$myDeclareAST += ')type,(%s)var)myDeclare'%($id2.text)}
    (Assign myExpr
        {$myDeclareAST += '((=)op,(%s)var,%s)myEpxer'%($id2.text, $myExpr.myExprAST)})?)*
    
    // array declaration: int a[10]; int b[2][3];
    | myType ID LeftBracket IntegerConstant RightBracket
        {$myDeclareAST += '((%s)type,((%s)arrayName,(%s'%($myType.myTypeAST, $ID.text, $IntegerConstant.text)}
    (LeftBracket IntegerConstant RightBracket
        {$myDeclareAST += ',%s'%($IntegerConstant.text)})* 
        {$myDeclareAST += ')arraySize)arrayVar'}
    (Assign LeftBrace 
        {$myDeclareAST += '('}
    int1=IntegerConstant
        {$myDeclareAST += '%s'%($int1.text)}
    (Comma int2=IntegerConstant
        {$myDeclareAST += ',%s'%($int2.text)})* 
    RightBrace
        {$myDeclareAST += ')initValue'})?
        {$myDeclareAST += ')myDeclare'}
    // function pointer declaration
    | myType LeftParen? Star? ID RightParen? LeftParen (myFuncInputPara(Comma myFuncInputPara)*)? RightParen
    
    // struct definition
    | STRUCT ID 
        {$myDeclareAST += '((%s)myStructName' %($ID.text)}
    myStatement
        {$myDeclareAST += '(%s)myStructBody)myStructDefinition' %($myStatement.myStatementAST)}
    ;
myFuncDefinition returns[myFuncDefinitionAST='']
    : myType ID LeftParen 
        {$myFuncDefinitionAST += '(%s)returnType,(%s)funcName,('%($myType.myTypeAST, $ID.text)}
    (myFuncInputPara
        {$myFuncDefinitionAST += '%s'%($myFuncInputPara.myFuncInputParaAST)} 
    (Comma myFuncInputPara
        {$myFuncDefinitionAST += ',%s'%($myFuncInputPara.myFuncInputParaAST)} )*)?
        {$myFuncDefinitionAST += ')myFuncInputPara,'}
    RightParen myStatement
        {$myFuncDefinitionAST += '(%s)myFuncBody'%($myStatement.myStatementAST)}
    ;
myFuncInputPara returns[myFuncInputParaAST='']
    : // normal input parameter
    myType 
        {$myFuncInputParaAST += '((%s'%($myType.myTypeAST)}
    (Star
        {$myFuncInputParaAST += '*'})* 
    ID
        {$myFuncInputParaAST +=')type,(%s)var)myDeclare'%($ID.text)}
    // function pointer
    | myType LeftParen? Star? ID RightParen? LeftParen myType RightParen
    | VOID
    ;
myStatement returns[myStatementAST='']
    : // statement: '{' user_codes '}'
    (myNL
        {$myStatementAST += '%s'%($myNL.myNLAST)}
    )* LeftBrace (myNL
        {$myStatementAST += '%s'%($myNL.myNLAST)}
    )* (myFuncBodyCode
        {$myStatementAST += '%s'%($myFuncBodyCode.myFuncBodyCodeAST)})* 
        RightBrace(myNL
        {$myStatementAST += '%s'%($myNL.myNLAST)}
    )*
    | myFuncBodyCode
        {$myStatementAST += '%s'%($myFuncBodyCode.myFuncBodyCodeAST)}
    ;
myFuncBodyCode returns[myFuncBodyCodeAST='']
    : myDeclare Semi
        {$myFuncBodyCodeAST += '%s'%($myDeclare.myDeclareAST)}
    | myExpr Semi
        {$myFuncBodyCodeAST += '%s'%($myExpr.myExprAST)}
    | myReturn Semi
        {$myFuncBodyCodeAST += '%s'%($myReturn.myReturnAST)}
    | mySelection
        {$myFuncBodyCodeAST += '%s'%($mySelection.mySelectionAST)}
    | myIteration
        {$myFuncBodyCodeAST += '%s'%($myIteration.myIterationAST)}
    | myNL
        {$myFuncBodyCodeAST += '%s'%($myNL.myNLAST)}
    ;
myExpr returns[myExprAST='']
    :// priority level 1
     e1=myExpr PlusPlus                    // a++
        {$myExprAST += '((=)op,%s,((+)op,%s,(1)intConst)myExpr)myExpr'%($e1.myExprAST, $e1.myExprAST)}
    | e1=myExpr MinusMinus                 // a--
        {$myExprAST += '((=)op,%s,((-)op,%s,(1)intConst)myExpr)myExpr'%($e1.myExprAST, $e1.myExprAST)}
    | ID LeftParen                         // func(1, 2, 3...)
            {$myExprAST += '((%s)myFuncName('%($ID.text)}
        (myExpr 
            {$myExprAST += '%s'%($myExpr.myExprAST)}
        (Comma myExpr
            {$myExprAST += '%s'%($myExpr.myExprAST)})*
        )*
            {$myExprAST += ')inputPara)myFuncCall'}
        RightParen
    | ID LeftBracket myExpr RightBracket// a[3], a[x+4]
        {$myExprAST += '((%s)arrayName,(%s)arrayIndex)myArrayVar'%($ID.text, $myExpr.myExprAST)}
    | e1=myExpr Dot ID                  // a.b
        {$myExprAST += '(%s(%s)myStructMember)myStructVar' %($e1.myExprAST, $ID.text)}
    | e1=myExpr Arrow ID                // a->b
        {$myExprAST += '(%s(%s)myStructMember)myPtrVar' %($e1.myExprAST, $ID.text)}
    // priority level 2
    | Plus myExpr                       // +3
        {$myExprAST += '%s'%($myExpr.myExprAST)}
    | Minus myExpr                      // -3
        {$myExprAST += '((*)op,%s,-1)myExpr'%($myExpr.myExprAST)}
    | Not myExpr                        // !a
    | Tilde myExpr                      // ~a
    | LeftParen myType (Star)* RightParen myExpr// (int)x
        {$myExprAST += '((%s)castingType,%s)myCasting'%($myType.myTypeAST, $myExpr.myExprAST)}
    | Star myExpr                       // *a
        {$myExprAST += '(%s)addrContent'%($myExpr.myExprAST)}
    | And myExpr                        // &a
        {$myExprAST += '(%s)varAddr'%($myExpr.myExprAST)}
    // priority level 3
    | e1=myExpr op=(Star|Div|Mod) e2=myExpr      // a*b, a/b, a%b
        {$myExprAST += '((%s)op,%s,%s)myExpr'%($op.text, $e1.myExprAST, $e2.myExprAST)}
    // priority level 4
    | e1=myExpr op=(Plus|Minus) e2=myExpr        // a+b, a-b
        {$myExprAST += '((%s)op,%s,%s)myExpr'%($op.text, $e1.myExprAST, $e2.myExprAST)}
    // priority level 5
    | e1=myExpr op=(LeftShift|RightShift) e2=myExpr  // a<<b, a>>b
        {$myExprAST += '((%s)op,%s,%s)myExpr'%($op.text, $e1.myExprAST, $e2.myExprAST)}
    // priority level 6
    | e1=myExpr op=(Less|LessEqual|Greater|GreaterEqual) e2=myExpr   // a>b, a>=b, a<b, a<=b
        {$myExprAST += '((%s)op,%s,%s)myExpr'%($op.text, $e1.myExprAST, $e2.myExprAST)}
    // priority level 7
    | e1=myExpr op=(Equal|NotEqual) e2=myExpr    // a==b, a!=b
        {$myExprAST += '((%s)op,%s,%s)myExpr'%($op.text, $e1.myExprAST, $e2.myExprAST)}
    // priority level 8
    | e1=myExpr op=And e2=myExpr                 // a&b
        {$myExprAST += '((%s)op,%s,%s)myExpr'%($op.text, $e1.myExprAST, $e2.myExprAST)}
    // priority level 9
    | e1=myExpr op=Caret e2=myExpr               // a^b
        {$myExprAST += '((%s)op,%s,%s)myExpr'%($op.text, $e1.myExprAST, $e2.myExprAST)}
    // priority level 10
    | e1=myExpr op=Or e2=myExpr                  // a|b
        {$myExprAST += '((%s)op,%s,%s)myExpr'%($op.text, $e1.myExprAST, $e2.myExprAST)}
    // priority level 11
    | e1=myExpr op=AndAnd e2=myExpr              // a&&b
        {$myExprAST += '((%s)op,%s,%s)myExpr'%($op.text, $e1.myExprAST, $e2.myExprAST)}
    // priority level 12
    | e1=myExpr op=OrOr e2=myExpr                // a||b
        {$myExprAST += '((%s)op,%s,%s)myExpr'%($op.text, $e1.myExprAST, $e2.myExprAST)}
    // priority level 14
    | e1=myExpr op=(Assign|PlusAssign|MinusAssign|StarAssign|DivAssign|ModAssign|LeftShiftAssign|RightShiftAssign|AndAssign|XorAssign|OrAssign) e2=myExpr
                                                // a=b, a+=b, a*=b ...
        {$myExprAST += '((%s)op,%s,%s)myExpr'%($op.text,$e1.myExprAST,$e2.myExprAST)}
    | LeftParen myExpr RightParen               // (a+b)*c
        {$myExprAST += '%s'%(myExpr.myExprAST)}
    | ID
        {$myExprAST += '(%s)ID'%($ID.text)}
    | IntegerConstant
        {$myExprAST += '(%s)intConst'%($IntegerConstant.text)}
    ;
mySelection returns[mySelectionAST='']
    : IF LeftParen 
        {$mySelectionAST += '(('}
    myExpr 
        {$mySelectionAST +='%s'%($myExpr.myExprAST)}
    RightParen 
        {$mySelectionAST +=')ifCondi'}
    myStatement
        {$mySelectionAST += '(%s)ifBody'%($myStatement.myStatementAST)}
     (ELSE myStatement
        {$mySelectionAST += '(%s)elseBody'%($myStatement.myStatementAST)})?
        {$mySelectionAST +=')mySelection'}
    ;
myIteration returns[myIterationAST='']
    : FOR LeftParen 
        {$myIterationAST += '('}
    myForCondi RightParen 
        {$myIterationAST += '%s'%($myForCondi.myForCondiAST)}
    myStatement
        {$myIterationAST += '(%s)myForBody)myFor'%($myStatement.myStatementAST)}
    | WHILE LeftParen myExpr? RightParen myStatement
    ;
myForCondi returns[myForCondiAST='']
    : 
        {$myForCondiAST += '('}
    (myDeclare
        {$myForCondiAST += '%s'%($myDeclare.myDeclareAST)}
    | myExpr
        {$myForCondiAST += '%s'%($myExpr.myExprAST)})?
        {$myForCondiAST += ')forInit('}
    Semi (myExpr
        {$myForCondiAST += '%s'%($myExpr.myExprAST)})? 
        {$myForCondiAST += ')forCondi('}
    Semi (myExpr
        {$myForCondiAST += '%s'%($myExpr.myExprAST)})?
        {$myForCondiAST += ')forIncrement'}
    ;

myReturn returns[myReturnAST='']
    : RETURN 
        {$myReturnAST += '('} 
    (myExpr
        {$myReturnAST += '%s'%($myExpr.myExprAST)})?
        {$myReturnAST += ')myReturn'} 
        
    ;
myType returns[myTypeAST='']
    : INT
        {$myTypeAST += 'int'}
    | VOID
        {$myTypeAST += 'void'}
    | STRUCT ID
        {$myTypeAST += '(%s)myStruct'%($ID.text)}
    ;

myNL returns[myNLAST='']    // for debugging (count line number)
    : '\n'
        {self.nl_count = self.nl_count+1}
        {$myNLAST='(%i)myNL'%(self.nl_count)}
    ;

// ==============================================================
// Lexer Token
INT: 'int';
VOID: 'void';
RETURN: 'return';
STRUCT: 'struct';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';

LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';
LeftShift : '<<';
RightShift : '>>';
Equal : '==';
NotEqual : '!=';

Plus: '+';
Minus: '-';
PlusPlus: '++';
MinusMinus: '--';
Star: '*';
Div: '/';
Mod : '%';

And : '&';
Or : '|';
AndAnd : '&&';
OrOr : '||';
Caret : '^';
Not : '!';
Tilde : '~';

Comma: ',';
Semi: ';';

Assign: '=';
StarAssign : '*=';
DivAssign : '/=';
ModAssign : '%=';
PlusAssign : '+=';
MinusAssign : '-=';
LeftShiftAssign : '<<=';
RightShiftAssign : '>>=';
AndAssign : '&=';
XorAssign : '^=';
OrAssign : '|=';

Dot: '.';
Arrow: '->';


IntegerConstant
    : '0'
    | DecimalConstant
    | HexConstant
    ;
DecimalConstant
    : [1-9][0-9]*
    ;
HexConstant
    : '0'[xX][0-9a-fA-F]+
    ;
ID
    : ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

// Skip rules


LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;
WhiteSpace
    : (' ' | '\t' | '\r') -> skip
    ;