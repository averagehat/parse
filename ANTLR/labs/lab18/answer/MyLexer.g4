lexer grammar MyLexer; 

NAME : [a-zA-Z]+ ;
INT  : [0-9]+ ;
BOOL : 'true' ;
DECIMAL : ('0' .. '9')+ '.' ('0' .. '9')+ ;
NL      : ('\r')?'\n' -> skip ;
WS      : [ \t\r\n]+ -> skip ;