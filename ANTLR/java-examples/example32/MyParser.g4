parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

words: .+ EOF ;