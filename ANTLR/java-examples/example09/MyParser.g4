parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

address   : street zipcode EOF ;
street    : NUMBER ROAD ;
zipcode   : ZIPCODE ;	