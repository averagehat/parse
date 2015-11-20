lexer grammar MyLexer; 

tokens { STRING }

DOUBLE : '"' .*? '"' 	-> type(STRING) ;

SINGLE : '\'' .*? '\'' 	-> type(STRING) ;

WS : [ \r\n\t]+ 		-> skip ;
