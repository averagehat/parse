lexer grammar MyLexer; 

NAME : [\u0041-\u007a\u00a0-\u00ff]+ ;
NL      : ('\r')?'\n' -> skip ;
WS      : [ \t\r\n]+ -> skip ;