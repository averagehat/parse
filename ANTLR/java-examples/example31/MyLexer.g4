lexer grammar MyLexer; 

INT  : [0-9]+ ;

EndMarker: '#' ;

WS  : [ \t\r\n]+ -> skip ;