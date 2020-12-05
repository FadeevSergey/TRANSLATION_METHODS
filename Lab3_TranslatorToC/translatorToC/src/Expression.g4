grammar Expression;

@header {
    import TreeNodes.*;
}

program returns [Node node] :
      main=mainBlock               {$node=new Program($main.node)}
    ;

mainBlock returns [Node node] :
    | maybeNewLine subBlock=mainSubBlock mainTail=mainBlock maybeNewLine       {$node=$subBlock.node}
    | maybeNewLine
    ;

mainSubBlock returns [Node node] :
      maybeNewLine for=forBlock maybeNewLine         {$node=$for.node}
    | maybeNewLine while=whileBlock maybeNewLine     {$node=$while.node}
    | maybeNewLine if=ifBlock maybeNewLine           {$node=$if.node}
    | maybeNewLine eq=equating maybeNewLine
    | maybeNewLine new=newVar
    | maybeNewLine pnt=print maybeNewLine
    ;

print :
      PRINT_TOKEN RLB_TOKEN variable RRB_TOKEN
    ;

newVar :
      constOrVar WHITE_SPACE variable COLON_V_TOKEN WHITE_SPACE* type  WHITE_SPACE* EQ_TOKEN WHITE_SPACE* eqRight
    | constOrVar WHITE_SPACE variable COLON_V_TOKEN WHITE_SPACE* type
    | constOrVar WHITE_SPACE variable WHITE_SPACE* EQ_TOKEN WHITE_SPACE* eqRight
    ;

equating :
      constOrVar WHITE_SPACE variable WHITE_SPACE* EQ_TOKEN WHITE_SPACE* eqRight
    |                         variable WHITE_SPACE* EQ_TOKEN WHITE_SPACE* eqRight
    ;

eqRight :
      mathExpression
    | readVar
    ;

forBlock returns [Node node] :
      FOR WHITE_SPACE var=variable WHITE_SPACE IN WHITE_SPACE RANGE rng=range maybeNewLine CLB_TOKEN main=mainBlock CRB_TOKEN {$node = new ForBlock($var.node, $rng.node, $main.node);}
     ;

whileBlock returns [Node node] :
      WHILE WHITE_SPACE cnd=logExpression maybeNewLine CLB_TOKEN main=mainBlock CRB_TOKEN {$node=new WhileBlock($cnd.text, $main.node)}
     ;

ifBlock returns [Node node] :
      maybeNewLine if=justIf maybeNewLine             {$node=new JustIf($if.node)}
    | maybeNewLine ifAndElse=ifElse maybeNewLine         {$node=new IfAndElse($ifElse.node)}
    ;

justIf returns [JustIf node] :
      IF WHITE_SPACE cnd=logExpression maybeNewLine CLB_TOKEN body=mainBlock CRB_TOKEN maybeNewLine {$node=new JustIf($cnd.text, $body.node)}
    ;

ifElse returns [Node node] :
      if=justIf ELSE maybeNewLine CLB_TOKEN body=mainBlock CRB_TOKEN {$node=new EfElseBlock($if.node.getCondition(), $if.node.body(), $body.node)}
    ;

range returns [Node node] :
//      RLB_TOKEN leftVar=mathExpression COLON rightVar=mathExpression RRB_TOKEN {$node=new range($leftVar.node, $rightVar.node)}
      RLB_TOKEN leftVar=mathExpression COLON_G_TOKEN rightVar=mathExpression RRB_TOKEN
    ;


variable returns [Node node] :
      VARIABLE_TOKEN                                      {$node = new Var($VARIABLE_TOKEN.text);}
    ;

newLine :
    | NEW_LINE
    | NEW_LINE newLine
    | WHITE_SPACE newLine
    | newLine WHITE_SPACE
    ;

maybeNewLine :
      newLine
    |
    ;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

mathExpression :
      RLB_TOKEN WHITE_SPACE* mathExpression WHITE_SPACE* RRB_TOKEN
    | left=mathExpression WHITE_SPACE* op=mathOperators WHITE_SPACE* right=mathExpression
    | variable
    | DECIMAL
    ;

logExpression [String str]:
      RLB_TOKEN WHITE_SPACE* logExpression WHITE_SPACE* RRB_TOKEN {$str=new String()}                    #parenExpression
    | NOT_TOKEN WHITE_SPACE* logExpression                        {$str=new String()}                   #notExpression
    | left=logExpression WHITE_SPACE* op=comparator WHITE_SPACE* right=logExpression {$str=new String()} #comparatorExpression
    | left=logExpression WHITE_SPACE* op=binary WHITE_SPACE* right=logExpression     {$str=new String()} #binaryExpression
    | bool                                                                           {$str=new String()} #boolExpression
    | variable                                                                       {$str=new String()} #identifierExpression
    | DECIMAL                                                                        {$str=new String()} #decimalExpression
    | me=mathExpression                                                              {$str=new String()} #mathhExpression
    ;

readVar :
      READ_INT_TYPE    RLB_TOKEN RRB_TOKEN
    | READ_DOUBLE_TYPE RLB_TOKEN RRB_TOKEN
    | READ_CHAR_TYPE   RLB_TOKEN RRB_TOKEN
    | READ_BOOL_TYPE   RLB_TOKEN RRB_TOKEN
    ;

constOrVar :
      VAR_TOKEN
    | LET_TOKEN
    ;

mathOperators :
      PLUS_TOKEN
    | MINUS_TOKEN
    | MUL_TOKEN
    | DIV_TOKEN
    | MOD_TOKEN
    ;

comparator :
      GT_TOKEN
    | GE_TOKEN
    | LT_TOKEN
    | LE_TOKEN
    | EQ_LOG_TOKEN
    | NOT_EQ_TOKEN
    ;

type :
      INT_TYPE
    | DOUBLE_TYPE
    | CHAR_TYPE
    | BOOL_TYPE
    ;

binary :
      AND_TOKEN
    | OR_TOKEN
    ;

bool :
      TRUE_TOKEN
    | FALSE_TOKEN
    ;


INT_TYPE   : 'Int'   ;
DOUBLE_TYPE: 'Double';
CHAR_TYPE  : 'Char'  ;
BOOL_TYPE  : 'Bool'  ;

READ_INT_TYPE   : 'readInt'   ;
READ_DOUBLE_TYPE: 'readDouble';
READ_CHAR_TYPE  : 'readChar'  ;
READ_BOOL_TYPE  : 'readBool'  ;

PRINT_TOKEN : 'print';
READ_TOKEN : 'read';
VAR_TOKEN : 'var';
LET_TOKEN : 'let';

EQ_TOKEN  : '=';

WHILE : 'while' ;
FOR   : 'for'   ;
IN    : 'in'    ;
RANGE : 'range' ;
COLON_G_TOKEN : '..';
COLON_V_TOKEN : ':' ;

IF    : 'if'    ;
ELSE  : 'else'  ;

RLB_TOKEN : '(' ;
RRB_TOKEN : ')' ;

CLB_TOKEN : '{' ;
CRB_TOKEN : '}' ;

AND_TOKEN   : '&&'   ;
OR_TOKEN    : '||'   ;
NOT_TOKEN   : '!'    ;

TRUE_TOKEN  : 'true' ;
FALSE_TOKEN : 'false';

PLUS_TOKEN  : '+';
MINUS_TOKEN : '-';
MUL_TOKEN   : '*';
DIV_TOKEN   : '/';
MOD_TOKEN   : '%';


GT_TOKEN  : '>'  ;
GE_TOKEN  : '>=' ;
LT_TOKEN  : '<'  ;
LE_TOKEN  : '<=' ;
EQ_LOG_TOKEN  : '==' ;
NOT_EQ_TOKEN  : '!=' ;



DECIMAL    : '-'? [0-9]+ ( '.' [0-9]+ )? ;
VARIABLE_TOKEN  : [a-zA-Z_] [a-zA-Z_0-9]*     ;
NEW_LINE   : '\n'+                       ;
WHITE_SPACE: [ \r\t\u000C\n]+            ;