grammar Bencode;

r: (binteger | bstring | blist | bdictionary) EOF;

binteger: 'i' INT 'e';


bstring: INT ':' string[$INT.int] ;
string[int n] locals [int i = 1] : ( {$i<=$n}? CHAR {$i = $i + 1} )* ;
blist: 'l' (binteger | bstring | blist | bdictionary)+ 'e';

bdictionary: 'd' (bstring (binteger | bstring | blist | bdictionary))+ 'e';

INT : DIGIT+ ;

CHAR : ('a'..'z') ;

fragment DIGIT : [0-9] ;



//bstring: INT ':' STRING;
//d3:one3:twoeline 1:12 missing 'e' at '<EOF>' (r (bdictionary d (bstring 3 : one) (bstring 3 : twoe) <missing 'e'>) <EOF>)



