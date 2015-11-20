lexer grammar MyLexer;    				

COMMA  : ',' ;
NL     : ('\r')?'\n' ;
WS     : [ \t\r\n]+ -> skip ;

QUOTED_FIELD : '"' .*? '"'
    {
       String theString = getText(); 
       int firstLetter = 1;
       int lastLetter = theString.length() - 1;
       String unquotedString = theString.substring(firstLetter, lastLetter);
       String unquotedComma = unquotedString.replace("\"\",\"\"", ",");
       String theNewString = unquotedComma.replace("\"\"", "\"");
       setText(theNewString);  
	} -> type(FIELD);

FIELD : ( ANY_CHAR_EXCEPT_COMMA_AND_QUOTE_AND_NL | ESCAPED_COMMA | ESCAPED_QUOTE )+
    {
       String theString = getText(); 
       String unquotedComma = theString.replace("\"\",\"\"", ",");
       String theNewString = unquotedComma.replace("\"\"", "\"");
       setText(theNewString); 
	};

fragment ANY_CHAR_EXCEPT_COMMA_AND_QUOTE_AND_NL : ~[,"\r\n] ;
fragment ESCAPED_COMMA : '\"\",\"\"' ;
fragment ESCAPED_QUOTE : '\"\"' ;