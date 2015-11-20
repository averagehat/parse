lexer grammar MyLexer; 

ZIPCODE : [0-9][0-9][0-9][0-9][0-9] ;
COMMA   : ',' -> skip ;
NL      : ('\r')?'\n' -> skip ;
WS      : [ \t\r\n]+ -> skip ;
STRING  : (~[,\r\n])+ -> skip ;