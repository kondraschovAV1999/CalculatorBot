grammar arithmetic;

prog:
    (equation ';')* (expression ';')?
    ;

equation
   : variable EQ expression
   ;

expression
   : multiplyingExpression (add_sub expression)?
   ;

multiplyingExpression
   : powExpression (mul_div multiplyingExpression)?
   ;

powExpression
   : signedAtom (POW powExpression)?
   ;

signedAtom
   : PLUS signedAtom
   | MINUS signedAtom
   | function
   | atom
   ;

atom
   : scientific
   | variable
   | constant
   | LPAREN expression RPAREN
   ;

scientific
   : SCIENTIFIC_NUMBER
   ;

constant
   : PI
   | EULER
   ;

variable
   : NAME
   ;

function
   : funcname LPAREN expression (COMMA expression)* RPAREN
   ;

funcname
   : NAME
   ;

add_sub
    :PLUS
    |MINUS
    ;

mul_div:
    DIV
    |MUL
    ;

LPAREN
   : '('
   ;

RPAREN
   : ')'
   ;

PLUS
   : '+'
   ;

MINUS
   : '-'
   ;

MUL
   : '*'
   ;

DIV
   : '/'
   ;

EQ
   : '='
   ;

COMMA
   : ','
   ;

POINT
   : '.'
   ;

POW
   : '^'
   ;

PI
   : 'pi'
   ;

EULER
   : E2
   ;

NAME
   : VALID_ID_START VALID_ID_CHAR*
   ;

fragment VALID_ID_START
   : ('a' .. 'z') | ('A' .. 'Z') | '_'
   ;


fragment VALID_ID_CHAR
   : VALID_ID_START | ('0' .. '9')
   ;

SCIENTIFIC_NUMBER
   : NUMBER ((E1 | E2) SIGN? NUMBER)?
   ;

fragment NUMBER
   : ('0' .. '9') + ('.' ('0' .. '9') +)?
   ;

fragment E1
   : 'E'
   ;

fragment E2
   : 'e'
   ;

fragment SIGN
   : ('+' | '-')
   ;

NEWLINE
    :'\r'? '\n'
    ;

WS
   : [ \t] + -> skip
   ;