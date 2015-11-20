parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

received : Received fromToken byToken withToken idToken SemiColon date EOF ;

fromToken : FromText ;

byToken: ByText ;

withToken : WithText ;

idToken : IdText ;

date : DateContents+ ;