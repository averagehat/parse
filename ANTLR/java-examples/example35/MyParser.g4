parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

statement : expression ;

expression : <assoc=right> expression EXPON expression
           | INT
           ;