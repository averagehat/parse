parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

document  : (header rows pairs)+ EOF ;
header    : field (COMMA field)* NL ;
rows      : (row)* ;	
row       :	field (COMMA field)* NL ;
field     : STRING | ;

pairs     : (pair)* ;
pair      : key EQ value NL2;
key       : KEY ;
value     : VALUE ;		