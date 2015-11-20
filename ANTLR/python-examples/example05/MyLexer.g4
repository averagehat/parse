lexer grammar MyLexer;    				

LCurly : '{' ;
RCurly : '}' ;
EQ : '=' ;

UnquotedString : [a-zA-Z]+ ;

QuotedString : '"' UnquotedString '"' 
      { 
       theString = self.text
       firstLetter = 1
       lastLetter = len(theString) - 1
       theNewString = theString[firstLetter:lastLetter]
       self.text = theNewString
      } ;

WS  : [ \t\r\n]+ -> skip ;
