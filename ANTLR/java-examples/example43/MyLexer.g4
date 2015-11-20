lexer grammar MyLexer;    				

Received : 'Received: ' ;
SemiColon : ';' ;

FromText
    : 'from ' 
      .+? 
      {
       // Use lookahead to look for specific characters
       // More on LA(1): http://www.antlr.org/api/Java/index.html?org/antlr/v4/runtime/IntStream.html
       (_input.LA(1) == 'b') &&
       (_input.LA(2) == 'y')
      }?
    ;
    
ByText
    : 'by '
      .+? 
      {
       (_input.LA(1) == 'w') &&
       (_input.LA(2) == 'i') &&
       (_input.LA(3) == 't') &&
       (_input.LA(4) == 'h')
      }?
    ;

WithText
    : 'with '
      .+? 
      {
       (_input.LA(1) == 'i') &&
       (_input.LA(2) == 'd')
      }?
    ;

IdText
    : 'id '
      .+? 
      {
       (_input.LA(1) == ';')
      }?
    ;
    
DateContents : ('Mon' | 'Tue' | 'Wed' | 'Thu' | 'Fri' | 'Sat' | 'Sun') (Letter | Number | Special)+ ;

fragment Letter :  'A'..'Z' | 'a'..'z' ;

fragment Number : '0'..'9' ;

fragment Special : ' ' | '_' | '-' | '.' | ',' | '~' | ':' | '+' | '$' | '=' | '(' | ')' | '[' | ']' | '/' ;

Whitespace : [\t\r\n]+ -> skip ;