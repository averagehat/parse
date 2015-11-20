parser grammar MyParser;    			

options { tokenVocab=MyLexer; }	

everything : (.)+ EOF ;