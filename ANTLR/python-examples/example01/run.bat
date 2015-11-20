@echo off

set PATH=../../jdk1.7.0_76/bin;%PATH%
set CLASSPATH=.;../../antlr-jar/antlr-complete.jar;%CLASSPATH%

echo.
echo.
echo.
echo **********************************************

echo Running ANTLR on the lexer: MyLexer.g4
java org.antlr.v4.Tool -Dlanguage=Python2 MyLexer.g4 -no-listener -no-visitor
echo.
echo.

echo Running ANTLR on the parser: MyParser.g4
java org.antlr.v4.Tool -Dlanguage=Python2 MyParser.g4 -no-listener -no-visitor
echo.
echo.

echo ***Important*** 
echo The test rig only operates on Java .class files. It does
echo not operate on Python .py files. 
echo.
echo.

echo So we need to generate the Java files
java org.antlr.v4.Tool MyLexer.g4 -no-listener -no-visitor
java org.antlr.v4.Tool MyParser.g4 -no-listener -no-visitor
echo.

echo Then compile the .java files
javac *.java
echo.

echo Now run the test rig on the generated (Java) parser, using as input the string in: input.txt
echo And generating a GUI output (i.e., a parse tree graphic)
java org.antlr.v4.gui.TestRig My message -gui < input.txt
echo.

echo Lastly, discard the .java and .class files
del *.java
del *.class

echo.
echo.