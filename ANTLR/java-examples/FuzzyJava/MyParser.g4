parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

file : .*? (constant .*?)+ ;

constant : Constant ;