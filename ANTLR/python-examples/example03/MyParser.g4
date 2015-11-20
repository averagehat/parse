parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

file: group+ ;

group: INT sequence[$INT.int] ;
	 
sequence[int n] locals [int i = 1] : ( {$i<=$n}? INT {$i++} )* ;			