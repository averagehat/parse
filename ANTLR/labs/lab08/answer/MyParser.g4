parser grammar MyParser;    			

options { tokenVocab=MyLexer; }	

json   : (array | object)+? EOF ;	

array : LeftBracket RightBracket 
      | 
		LeftBracket (array | object | integer) (Comma (array | object | integer))* RightBracket 
	  ;
		
object : LeftBrace RightBrace
       | 
	     LeftBrace (name Colon (array | object | integer)) (Comma (name ':' (array | object | integer)))* RightBrace
	   ;

name : Name ;

integer : Int ;