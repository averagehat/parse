lexer grammar MyLexer;

LeftBracket : '[' ;

RightBracket : ']' ;

LeftBrace : '{' ;

RightBrace : '}' ;

Name : '"' .+? '"' ;

Int : [0-9]+ ;

Comma : ',' ;

Colon : ':' ; 

WS : [ \r\n]+ -> skip ;
