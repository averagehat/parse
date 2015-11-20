lexer grammar MyLexer;    				

KEY       : ('FirstName' | 'LastName') ;
VALUE     : (~[=\r\n])+ ;
EQ        : '=' ;
WS       : [ \t\r\n]+ -> skip ;