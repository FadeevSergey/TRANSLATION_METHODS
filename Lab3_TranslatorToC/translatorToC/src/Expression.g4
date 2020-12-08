grammar Expression;

@header {
    import TreeNodes.*;
}

program returns [Program node] :
      main=mainBlock               {$node=new Program($main.main)}
    ;

mainBlock returns [MainBlock main] :
    | maybeNewLine subBlock=mainSubBlock mainTail=mainBlock maybeNewLine
        {
            $main=new MainBlock($subBlock.block, $mainTail.main)
        }
    | maybeNewLine
        {
            $main=null
        }
    ;

mainSubBlock returns [Node block] :
      maybeNewLine for=forBlock maybeNewLine         {$block=$for.for}
    | maybeNewLine while=whileBlock maybeNewLine     {$block=$while.node}
    | maybeNewLine if=ifBlock maybeNewLine           {$block=$if.node}
    | maybeNewLine eq=equating maybeNewLine          {$block=null}
    | maybeNewLine new=newVar                        {$block=null}
    | maybeNewLine pnt=print maybeNewLine            {$block=$pnt.pnt}
    ;

print returns [Print pnt]:
      PRINT_TOKEN RLB_TOKEN vr=variable RRB_TOKEN       {$pnt=new Print($vr.var)}
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
    | vr=readVar
    ;

forBlock returns [ForBlock for] :
      FOR WHITE_SPACE var=variable WHITE_SPACE IN WHITE_SPACE RANGE rng=range maybeNewLine CLB_TOKEN main=mainBlock CRB_TOKEN {$for = new ForBlock($var.var, $rng.rng, $main.main);}
     ;

whileBlock returns [Node node] :
      WHILE WHITE_SPACE cnd=logExpression maybeNewLine CLB_TOKEN main=mainBlock CRB_TOKEN {$node=new WhileBlock($cnd.text, $main.main)}
     ;

ifBlock returns [Node node] :
      maybeNewLine if=justIf maybeNewLine             {$node=new JustIf($if.node)}
    | maybeNewLine ifAndElse=ifElse maybeNewLine         {$node=new IfAndElse($ifElse.node)}
    ;

justIf returns [JustIf node] :
      IF WHITE_SPACE cnd=logExpression maybeNewLine CLB_TOKEN body=mainBlock CRB_TOKEN maybeNewLine {$node=new JustIf($cnd.text, $body.main)}
    ;

ifElse returns [Node node] :
      if=justIf ELSE maybeNewLine CLB_TOKEN body=mainBlock CRB_TOKEN {$node=new EfElseBlock($if.node.getCondition(), $if.node.body(), $body.main)}
    ;

range returns [Range rng] :
//      RLB_TOKEN leftVar=mathExpression COLON rightVar=mathExpression RRB_TOKEN {$node=new range($leftVar.node, $rightVar.node)}
      RLB_TOKEN leftVar=mathExpression COLON_G_TOKEN rightVar=mathExpression RRB_TOKEN {$rng=new Range(0, 100)}
    ;


variable returns [Var var] :
      VARIABLE_TOKEN                                      {$var = new Var($VARIABLE_TOKEN.text, Types.Unknown);}
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

mathExpression returns [Types tpe]:
      RLB_TOKEN WHITE_SPACE* mathExpression WHITE_SPACE* RRB_TOKEN                        {$tpe=Types.Unknown}
    | left=mathExpression WHITE_SPACE* op=mathOperators WHITE_SPACE* right=mathExpression {$tpe=Types.Unknown}
    | variable {$tpe=Types.Unknown}
    | DECIMAL  {$tpe=Types.Unknown}
    ;

logExpression:
      RLB_TOKEN WHITE_SPACE* logExpression WHITE_SPACE* RRB_TOKEN                     #parenExpression
    | NOT_TOKEN WHITE_SPACE* logExpression                                            #notExpression
    | left=logExpression WHITE_SPACE* op=comparator WHITE_SPACE* right=logExpression  #comparatorExpression
    | left=logExpression WHITE_SPACE* op=binary WHITE_SPACE* right=logExpression      #binaryExpression
    | bool                                                                            #boolExpression
    | variable                                                                        #identifierExpression
    | DECIMAL                                                                         #decimalExpression
    | me=mathExpression                                                               #mathhExpression
    ;

readVar returns [Types tpe] :
      READ_INT_TYPE    RLB_TOKEN RRB_TOKEN  {$tpe = Types.Int}
    | READ_DOUBLE_TYPE RLB_TOKEN RRB_TOKEN  {$tpe = Types.Double}
    | READ_CHAR_TYPE   RLB_TOKEN RRB_TOKEN  {$tpe = Types.Char}
    | READ_BOOL_TYPE   RLB_TOKEN RRB_TOKEN  {$tpe = Types.Bool}
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