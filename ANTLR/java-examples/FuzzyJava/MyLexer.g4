lexer grammar MyLexer;

Constant : 'public' 'static' 'final' 'int' Identifier ;

Identifier : [a-zA-Z_$] [a-zA-Z_$0-9]* ;

WS  :   [ \r\t\u000C\n]+ -> channel(HIDDEN) ;

OTHER : . -> skip ;