grammar MyParser;		

file : (.)*? (constant (.)*?)+ ;

stuff : (.)*? ;  // A regex in a parser rule does not produce an implicit lexer rule

constant : 'public' 'static' 'final' 'int'              // A literal string in a parser rule does produce an implicit lexer rule
           //{System.out.println("constant: " + $Identifier.text);}
         ;

Identifier : [a-zA-Z_$] [a-zA-Z_$0-9]* -> skip ;

//String : ([a-zA-Z]|'.'|'*'|'{'|'}')+? -> skip ;

//WS  :   [ \r\t\u000C\n]+ -> skip ;

OTHER : . -> skip ;


/*
grammar MyParser;		

file : .*? (constant .*?)+ ;

constant : 'public' 'static' 'final' 'int' Identifier 
           {System.out.println("constant: " + $Identifier.text);}
         ;

Identifier : [a-zA-Z_$] [a-zA-Z_$0-9]* ;

OTHER : . -> skip ;
*/