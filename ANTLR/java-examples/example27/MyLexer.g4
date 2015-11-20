lexer grammar MyLexer; 

NAME : 'John' | 'Bill' | 'Sally' | 'Linda' ;   				

STUFF : (.)+? -> skip ;