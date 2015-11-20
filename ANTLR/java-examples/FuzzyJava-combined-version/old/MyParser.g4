grammar MyParser;		

file : .*? (constant .*?)+ ;

constant : 'public' 'static' 'final' 'int' Identifier 
           {System.out.println("constant: " + $Identifier.text);}
         ;

Identifier : [a-zA-Z_$] [a-zA-Z_$0-9]* ;

WS  :   [ \r\t\u000C\n]+ -> channel(HIDDEN) ;

OTHER : . -> skip ;