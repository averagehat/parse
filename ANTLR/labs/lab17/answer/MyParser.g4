parser grammar MyParser;    			

options { tokenVocab=MyLexer; }	

names : (name)* EOF ;

name : NAME ;