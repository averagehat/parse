parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

list: INT+ endMarker ;

endMarker: EndMarker
         |
	     ;