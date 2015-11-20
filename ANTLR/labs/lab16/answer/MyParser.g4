parser grammar MyParser;    			

options { tokenVocab=MyLexer; }	

classifications : (classification)* EOF ;

classification : CLASSIFICATION ;