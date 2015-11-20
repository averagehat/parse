lexer grammar MyLexer;    				

COMMA  : ',' ;
NL     : ('\r')?'\n' ;
WS     : [ \t\r\n]+ -> skip ;

FIELD : ( ... )*
    {
       String theString = getText(); 
       String withoutEscapedComma = theString.replace("\\,", ",");
       ... 
	};

fragment ANY_CHAR_EXCEPT_COMMA_AND_NL_AND_BACKSLASH : ~[,\\\r\n] ;
fragment ESCAPED_COMMA : '\\,' ;
fragment ESCAPED_BACKSLASH : '\\\\' ;
fragment ESCAPED_NL : '\\' NL ;