lexer grammar MyLexer;

import MyLexer_imported ;

LeftBracket : '[' ;

RightBracket : ']' ;

LeftBrace : '{' ;

RightBrace : '}' ;

Name : '"' .+? '"' ;
