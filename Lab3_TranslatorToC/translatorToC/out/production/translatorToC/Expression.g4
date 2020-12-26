grammar Expression;

@header {
    import TreeNodes.*;
}

program returns [Program node] :
      main=mainBlock               {$node=new Program($main.main);}
    ;

mainBlock returns [MainBlock main] :
    | maybeNewLine subBlock=mainSubBlock mainTail=mainBlock maybeNewLine
        {
            $main=new MainBlock($subBlock.block, $mainTail.main);
        }
    | maybeNewLine
        {
            $main=null;
        }
    ;

mainSubBlock returns [MainSubBlock block] :
      maybeNewLine forBlc=forBlock maybeNewLine         {$block=new MainSubBlock($forBlc.forr);}
    | maybeNewLine whileBlc=whileBlock maybeNewLine     {$block=new MainSubBlock($whileBlc.node);}
    | maybeNewLine doWhl=doWhile maybeNewLine           {$block=new MainSubBlock($doWhl.node);}
    | maybeNewLine ifBlc=ifBlock maybeNewLine           {$block=new MainSubBlock($ifBlc.node);}
    | maybeNewLine eqBlc=equating maybeNewLine          {$block=new MainSubBlock($eqBlc.equat);}
    | maybeNewLine newBlc=newVar maybeNewLine           {$block=new MainSubBlock($newVar.expr);}
    | maybeNewLine pntBlc=print maybeNewLine            {$block=new MainSubBlock($pntBlc.pnt);}
    ;

print returns [Print pnt]:
      PRINT_TOKEN RLB_TOKEN vr=variable[Types.Unknown] RRB_TOKEN       {$pnt=new Print($vr.var);}
    | PRINT_TOKEN RLB_TOKEN mathExpr=mathExpression RRB_TOKEN       {$pnt=new Print($mathExpr.expr);}
    | PRINT_TOKEN RLB_TOKEN logExpr=logExpression RRB_TOKEN       {$pnt=new Print(new Condition($logExpr.text));}
    ;

newVar returns [NewVar expr]:
      mut=constOrVar WHITE_SPACE var=variable[Types.Unknown] COLON_V_TOKEN WHITE_SPACE* t=type  WHITE_SPACE* EQ_TOKEN WHITE_SPACE* right=eqRight[$var.var]
      {
          $expr=new NewVar($mut.mutable, $var.var.setType($t.t), $t.t, $right.right);
      }
    | mut=constOrVar WHITE_SPACE var=variable[Types.Unknown] COLON_V_TOKEN WHITE_SPACE* t=type
      {
          $expr=new NewVar($mut.mutable, $var.var.setType($t.t), $t.t, null);
      }
    | mut=constOrVar WHITE_SPACE var=variable[Types.Unknown] WHITE_SPACE* EQ_TOKEN WHITE_SPACE* right=eqRight[$var.var]
      {
          if($right.right instanceof MathExpression) {
              $expr=new NewVar($mut.mutable, $var.var.setType($right.right.getType()), $right.right.getType(), $right.right);
          } else if($right.right instanceof ReadVar) {
              Types varType = ((ReadVar)$right.right).getType();
              $expr=new NewVar($mut.mutable, $var.var.setType(varType), varType, $right.right);
          } else {
              $expr=new NewVar($mut.mutable, $var.var, Types.Bool, $right.right);
          }
      }
    ;

equating returns [Equating equat]:
      var=variable[Types.Unknown] WHITE_SPACE* EQ_TOKEN WHITE_SPACE* right=eqRight[$var.var] {$equat=new Equating($var.var, $right.right);}
    ;

eqRight [Var var] returns [EqRight right] :
      mtExpr=mathExpression {$right=$mtExpr.expr;}
    | vr=readVar[$var] {$right=$vr.tpe;}
    | logExpr=logExpression {$right=new Condition($logExpr.text);}
    ;

forBlock returns [ForBlock forr] :
      FOR WHITE_SPACE var=variable[Types.Int] WHITE_SPACE IN WHITE_SPACE RANGE rng=range maybeNewLine CLB_TOKEN main=mainBlock CRB_TOKEN {$forr = new ForBlock($var.var, $rng.rng, $main.main);}
    ;

whileBlock returns [Node node] :
      WHILE WHITE_SPACE cnd=logExpression maybeNewLine CLB_TOKEN main=mainBlock CRB_TOKEN
      {
          $node=new WhileBlock($cnd.text, $main.main);
      }
    ;

doWhile returns [Node node] :
      DO maybeNewLine CLB_TOKEN main=mainBlock CRB_TOKEN WHITE_SPACE* WHILE WHITE_SPACE cnd=logExpression
      {
          $node=new DoWhileBlock($cnd.text, $main.main);
      }
    ;

ifBlock returns [Node node] :
      maybeNewLine ifBlc=justIf maybeNewLine             {$node=$ifBlc.node;}
    | maybeNewLine ifAndElse=ifElse maybeNewLine         {$node=$ifAndElse.node;}
    ;

justIf returns [JustIfBlock node] :
      IF WHITE_SPACE cnd=logExpression maybeNewLine CLB_TOKEN body=mainBlock CRB_TOKEN maybeNewLine {$node=new JustIfBlock($cnd.text, $body.main);}
    ;

ifElse returns [IfElseBlock node] :
      ifBlc=justIf ELSE maybeNewLine CLB_TOKEN body=mainBlock CRB_TOKEN
      {
          $node=new IfElseBlock($ifBlc.node.getCondition(), $ifBlc.node.getBody(), $body.main);
      }
    ;

range returns [Range rng] :
//      RLB_TOKEN leftVar=mathExpression COLON rightVar=mathExpression RRB_TOKEN {$node=new range($leftVar.node, $rightVar.node)}
      RLB_TOKEN left=mathExpression COLON_G_TOKEN right=mathExpression RRB_TOKEN {$rng=new Range($left.expr, $right.expr);}
    ;

variable [Types tpe] returns [Var var] :
      VARIABLE_TOKEN                                      {$var = new Var($VARIABLE_TOKEN.text, tpe);}
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

mathExpression returns [MathExpression expr]:
      RLB_TOKEN WHITE_SPACE* mtExpr=mathExpression WHITE_SPACE* RRB_TOKEN
      {
          $expr=new MathExpression($mtExpr.text, $mtExpr.expr.getType());
      }
    | left=mathExpression WHITE_SPACE* op=mathOperators WHITE_SPACE* right=mathExpression
      {
          if($left.expr.getType() == Types.Double || $right.expr.getType() == Types.Double) {
              $expr=new MathExpression($left.text + " " + $op.text + " " + $right.text, Types.Double);
          } else {
              $expr=new MathExpression($left.text + " " + $op.text + " " + $right.text, Types.Int);
          }

      }
    | var=variable[Types.Unknown]
      {
          $expr=new MathExpression($var.var.toString(0), Types.Unknown);
      }
    | INTEGER
      {
          $expr=new MathExpression($INTEGER.text, Types.Int);
      }
    | DECIMAL
      {
          $expr=new MathExpression($DECIMAL.text, Types.Double);
      }

    ;

logExpression:
      RLB_TOKEN WHITE_SPACE* logExpression WHITE_SPACE* RRB_TOKEN                     #parenExpression
    | NOT_TOKEN WHITE_SPACE* logExpression                                            #notExpression
    | left=logExpression WHITE_SPACE* op=comparator WHITE_SPACE* right=logExpression  #comparatorExpression
    | left=logExpression WHITE_SPACE* op=binary WHITE_SPACE* right=logExpression      #binaryExpression
    | bool                                                                            #boolExpression
    | variable[Types.Unknown]                                                         #identifierExpression
    | me=mathExpression                                                               #mathhExpression

    ;

number returns [String str] :
      DECIMAL {$str=new String($DECIMAL.text);}
      INTEGER {$str=new String($INTEGER.text);}
    ;

readVar [Var var] returns [ReadVar tpe] :
      READ_INT_TYPE    RLB_TOKEN RRB_TOKEN  {$tpe = new ReadVar(var, Types.Int);}
    | READ_DOUBLE_TYPE RLB_TOKEN RRB_TOKEN  {$tpe = new ReadVar(var, Types.Double);}
    | READ_CHAR_TYPE   RLB_TOKEN RRB_TOKEN  {$tpe = new ReadVar(var, Types.Char);}
    | READ_BOOL_TYPE   RLB_TOKEN RRB_TOKEN  {$tpe = new ReadVar(var, Types.Bool);}
    ;

constOrVar returns [ConstOrVar mutable] :
      VAR_TOKEN {$mutable=ConstOrVar.VAR;}
    | LET_TOKEN {$mutable=ConstOrVar.LET;}
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

type returns [Types t]:
      INT_TYPE    {$t=Types.Int;}
    | DOUBLE_TYPE {$t=Types.Double;}
    | CHAR_TYPE   {$t=Types.Char;}
    | BOOL_TYPE   {$t=Types.Bool;}
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

DO    : 'do'    ;
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


INTEGER    : '-'? [0-9]+                 ;
DECIMAL    : '-'? [0-9]+ ( '.' [0-9]+ )? ;
VARIABLE_TOKEN  : [a-zA-Z_] [a-zA-Z_0-9]*;
NEW_LINE   : '\n'+                       ;
WHITE_SPACE: [ \r\t\u000C\n]+            ;