parser grammar MyParser;    			

options { tokenVocab=MyLexer; }	

document : section EOF ;

section : (title section ) 
        | title ;

title : STRING ;