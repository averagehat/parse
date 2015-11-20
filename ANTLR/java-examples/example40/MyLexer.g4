lexer grammar MyLexer;    				

LCurly : '{' ;
RCurly : '}' ;
EQ : '=' ;

UnquotedString : [a-zA-Z]+ ;

QuotedString : '"' UnquotedString '"' 
      { 
       // Get the string
       String theString = getText();  // This gets "John"
       int firstLetter = 1;
       int lastLetter = theString.length() - 1;
       // Extract the text within the quotes
       String theNewString = theString.substring(firstLetter, lastLetter); 
       // Set the string
       setText(theNewString);  // This sets the token value to be sent to the parser rule
      } ;

WS  : [ \t\r\n]+ -> skip ; 