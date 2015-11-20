lexer grammar MyLexer; 

Currency : '€' | '$' | '¥' | '£' ; 				

Amount : ('\r')? ('\n') ; 

Digit : [0-9] -> more ;

Decimal : '.' -> more ;