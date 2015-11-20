parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

file : (line)+ EOF ;

line : STRING NL ;