lexer grammar MyLexer;    				

LB    : '[' ;
RB    : ']' ;
INT   : [0-9]+ ;
COMMA : ',' ;
WS    : [ \t\r\n]+ -> skip ;