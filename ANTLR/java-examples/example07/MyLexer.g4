lexer grammar MyLexer;    				

GREETING : ('Hello' | 'Greetings') ;
ID  : [a-zA-Z]+ ;
NL  : ('\r')?'\n' ;
WS  : [ \t\r\n]+ -> skip ;