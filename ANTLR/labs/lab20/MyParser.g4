parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

document  : rows EOF ;
rows      : ... ;