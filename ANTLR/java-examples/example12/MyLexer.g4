lexer grammar MyLexer;    				

KEN    : 'Ken' ;
OTHER  : [a-zA-Z][a-zA-Z][a-zA-Z] ;
WS     : [ \t\r\n]+ -> skip ;