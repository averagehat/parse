lexer grammar MyLexer;    				

KEN    : 'Ken' ;
OTHER  : [a-zA-Z]+ ;
WS     : [ \t\r\n]+ -> skip ;