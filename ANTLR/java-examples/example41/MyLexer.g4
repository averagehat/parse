lexer grammar MyLexer;    				

STRING : ('A'..'Z' | 'a'..'z' | ' ' | '.' | ',')+ ;

NL  : '\r' '\n' ; 