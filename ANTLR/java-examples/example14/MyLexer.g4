lexer grammar MyLexer;    				

ARRAY  : '[' ']' 
         | 
		 '[' (ARRAY | INT) (',' (ARRAY | INT))* ']' 
		 ;
WS    : [ \t\r\n]+ -> skip ;

fragment INT : [0-9]+ ;