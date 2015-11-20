parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

statement : expression ;

expression : expression EXPON expression
           | INT
           ;