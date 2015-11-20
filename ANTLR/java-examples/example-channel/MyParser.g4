parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

csv       : (header rows)+ EOF ;
header    : field (COMMA field)* NL ;
rows      : (row)* ;	
row       :	field (COMMA field)* NL ;
field     : STRING | ;

keyValue  : pairs EOF ;
pairs     : (pair)+ ;
pair      : key EQ value NL2;
key       : KEY ;
value     : VALUE ;	