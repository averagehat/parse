lexer grammar MyLexer;    				

NAME  : ALPHA (ALPHA | DIGIT)* ;
WS    : [ \t\r\n]+ -> skip ;

fragment ALPHA : [a-zA-Z] ;
fragment DIGIT : [0-9] ;