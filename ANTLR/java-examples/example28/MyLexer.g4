lexer grammar MyLexer;

tokens { STRING }

ID : [a-zA-Z]+ ;

WS : [ \r\n] -> skip ;