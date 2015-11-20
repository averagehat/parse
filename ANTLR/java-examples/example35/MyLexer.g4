lexer grammar MyLexer;    	

EXPON : '^' ;
MULT : '*' ;
INT  : [0-9]+ ;
WS   : [ \t\r\n]+ -> skip ; 