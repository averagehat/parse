parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

intfile: group+ ;

group: INT sequence[$INT.int] ;
	 
sequence[int n] locals [int i = 1] : ( {$i<=$n}? INT {$i = $i + 1} )* ;			