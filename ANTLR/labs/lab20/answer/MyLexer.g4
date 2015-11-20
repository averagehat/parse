lexer grammar MyLexer;    				

COMMA  : ',' ;
NL     : ('\r')?'\n' ;
WS     : [ \t\r\n]+ -> skip ;

FIELD : ( ANY_CHAR_EXCEPT_COMMA_AND_NL_AND_BACKSLASH | ESCAPED_COMMA | ESCAPED_BACKSLASH | ESCAPED_NL )+
    {
       String theString = getText(); 
       String withoutEscapedComma = theString.replace("\\,", ",");
       String withoutEscapedBackslash = withoutEscapedComma.replace("\\\\", "\\");
       String withoutEscapedNL = withoutEscapedBackslash.replace("\\\r\n", " ");
       setText(withoutEscapedNL); 
	};

fragment ANY_CHAR_EXCEPT_COMMA_AND_NL_AND_BACKSLASH : ~[,\\\r\n] ;
fragment ESCAPED_COMMA : '\\,' ;
fragment ESCAPED_BACKSLASH : '\\\\' ;
fragment ESCAPED_NL : '\\' NL ;