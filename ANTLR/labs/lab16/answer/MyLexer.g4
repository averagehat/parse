lexer grammar MyLexer; 

tokens { CLASSIFICATION }

SECRET1 : [sS][eE][cC][rR][eE][tT] -> type(CLASSIFICATION) ;
SECRET2 : [sS][ -][eE][ -][cC][ -][rR][ -][eE][ -][tT] -> type(CLASSIFICATION) ;
NL      : ('\r')?'\n' -> skip ;
WS      : [ \t\r\n]+ -> skip ;