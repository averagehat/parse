lexer grammar MyLexer;    	

COMMA  : ',' 			-> channel(0) ;
NL     : ('\r')?'\n' 	-> channel(0) ;
WS     : [ \t\r\n]+ 	-> skip, channel(0) ;
STRING : (~[,\r\n])+ 	-> channel(0) ;			

KEY       : ('FirstName' | 'LastName') 	-> channel(1) ;
EQ        : '=' 						-> channel(1) ;
NL2       : ('\r')?'\n' 				-> channel(1) ;
WS2       : [ \t\r\n]+ 					-> skip, channel(1) ;
VALUE     : (~[=\r\n])+ 				-> channel(1) ;