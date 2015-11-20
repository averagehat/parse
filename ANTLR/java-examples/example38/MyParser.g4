parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

file: group+ ;

group: INT sequence ;
	 
sequence: ( INT )* ;			