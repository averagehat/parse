parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

document  : rows EOF ;
rows      : (row)* ;	
row       :	field (COMMA field)* NL ;
field     : FIELD | ;