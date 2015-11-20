lexer grammar MyLexer;    	

A  : 'a' -> channel(0) ;
B  : 'b' -> channel(1) ;
WS     : [ \t\r\n]+ 	-> skip ;