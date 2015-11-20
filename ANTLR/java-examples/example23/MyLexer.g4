lexer grammar MyLexer;    				

COMMA        : ',' ;
NL           : ('\r')?'\n' ;
BACKSLASH    : '\\' ;
CONTINUATION : BACKSLASH NL -> skip ;
WS           : [ \t\r\n]+ -> skip ;
STRING       : (ESCAPSED_COMMA|~[\\,\r\n])+ ;

fragment ESCAPSED_COMMA : '\\,' ;