
alias antlr4='java -Xmx500M -cp "/home/AMED/michael.panciera/parse/antlr-4.5.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
alias grun='java org.antlr.v4.runtime.misc.TestRig'

%Lexer.py %Parser.py %Lexer.tokens %Paser.tokens:  %.g4
	java -Xmx500M -cp "/home/AMED/michael.panciera/parse/antlr-4.5.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool $< 
	#antlr4 -Dlanguage=Python2 $< 
