parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

text : (a | b)+ EOF ;
a    : A ;
b    : B ;