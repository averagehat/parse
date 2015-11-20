lexer grammar MyLexer;    				

// Lexer rules
ENDBASE : BASE '$' ;
BASE : 'A' | 'C' | 'G' | 'T'
INT : [0-9]+ ;
MATCH : '.' | ',' ; 
