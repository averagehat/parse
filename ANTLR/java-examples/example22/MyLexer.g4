lexer grammar MyLexer;    				

COMMA        : ',' ;
NL           : ('\r')?'\n' ;
BACKSLASH    : '\\' ;
CONTINUATION : BACKSLASH NL -> skip ;
WS           : [ \t\r\n]+ -> skip ;
STRING       : (~[\\,\r\n])+ ;