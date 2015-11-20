parser grammar MyParser;    			

options { tokenVocab=MyLexer; }	

document : (title lines)+ EOF ;

title : TITLE ;

lines : (line)+ ;

line : LINE ;