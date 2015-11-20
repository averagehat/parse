lexer grammar MyLexer;    				

Received : 'Received: ' ;
SemiColon : ';' ;

FromText : 'from ' .+? 
	  {(self._input.LA(1) == ord('b')) and (self._input.LA(2) == ord('y'))}?
	  ;
    
ByText : 'by '.+? 
      {(self._input.LA(1) == ord('w')) and (self._input.LA(2) == ord('i')) and (self._input.LA(3) == ord('t')) and (self._input.LA(4) == ord('h'))}? 
	  ;

WithText : 'with ' .+? 
      {(self._input.LA(1) == ord('i')) and (self._input.LA(2) == ord('d'))}? 
	  ;

IdText : 'id ' .+? 
      {(self._input.LA(1) == ord(';'))}? 
	  ;
    
DateContents : ('Mon' | 'Tue' | 'Wed' | 'Thu' | 'Fri' | 'Sat' | 'Sun') (Letter | Number | Special)+ ;

fragment Letter :  'A'..'Z' | 'a'..'z' ;

fragment Number : '0'..'9' ;

fragment Special : ' ' | '_' | '-' | '.' | ',' | '~' | ':' | '+' | '$' | '=' | '(' | ')' | '[' | ']' | '/' ;

Whitespace : [\t\r\n]+ -> skip ;