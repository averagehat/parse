lexer grammar MyLexer;    				

COMMA  : ',' ;
NL     : ('\r')?'\n' ;
WS     : [ \t\r\n]+ -> skip ;
STRING : (~[,\r\n])+ ;