parser grammar MyParser;    			

options { tokenVocab=MyLexer; }	

text : (sentence)+ EOF ;

sentence : Sentence ;