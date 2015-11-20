parser grammar MyParser;    			

options { tokenVocab=MyLexer; }	

zipcodes : (zipcode)* EOF ;

zipcode : ZIPCODE ;