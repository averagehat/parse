lexer grammar MyLexer;    				

import MyLexer_imported ;

ID  : [a-zA-Z]+ ;
WS  : [ \t\r\n]+ -> skip ;