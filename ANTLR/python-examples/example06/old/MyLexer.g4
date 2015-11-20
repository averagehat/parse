lexer grammar MyLexer;    				

A_STRING : ('A'..'Z' | 'a'..'z' | ' ' | '.' | ',')+ ;

NL  : ('\r')?'\n' ; 