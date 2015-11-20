parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

document  : header rows EOF ;
header    : field (COMMA field)* NL ;
rows      : (row)* ;	
row       :	field (COMMA field)* NL ;
field     : STRING | ;		