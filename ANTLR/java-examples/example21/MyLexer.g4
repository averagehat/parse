lexer grammar MyLexer;    				

COMMA  : ',' ;
DASH   : '-' ;
NL     : ('\r')?'\n' ;
WS     : [ \t\r\n]+ -> skip ;
SEPARATOR : SEP -> skip, pushMode(PAIRS) ;
STRING : (~[,\r\n])+ ;

fragment SEP : '-' NL ;

mode PAIRS ;
KEY       : ('FirstName' | 'LastName') ;
EQ        : '=' ;
NL2       : ('\r')?'\n' ;
WS2       : [ \t\r\n]+ -> skip ;
SEPARATOR2 : SEP2 -> skip, popMode ;
VALUE     : (~[=\r\n])+ ;

fragment SEP2 : '-' NL2 ;