parser grammar MyParser;    			

options { tokenVocab=MyLexer; }			

silk : magic_bytes EOF ;

magic_bytes : dead_beef ;

dead_beef : MagicBytes ;