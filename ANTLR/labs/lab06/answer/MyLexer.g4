lexer grammar MyLexer; 

STRING : '"' .+? '"' ;

WS : [ \r\n]+ -> skip ;