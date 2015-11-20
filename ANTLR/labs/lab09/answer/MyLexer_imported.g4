lexer grammar MyLexer_imported;

Int : [0-9]+ ;

Comma : ',' ;

Colon : ':' ; 

WS : [ \r\n]+ -> skip ;
