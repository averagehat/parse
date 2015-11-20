lexer grammar MyLexer;    				

ZIPCODE : [0-9][0-9][0-9][0-9][0-9] ;
NUMBER  : [0-9]+ ;
ROAD    : [a-zA-Z][a-zA-Z ]+[a-zA-Z] ;
WS     : [ \t\r\n]+ -> skip ;