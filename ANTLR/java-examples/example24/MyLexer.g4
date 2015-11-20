lexer grammar MyLexer;    				

LINE  : ('\r')?'\n' ; 
CHAR  : .   -> more;

//LINE  : (.)+?('\r')?'\n' ;