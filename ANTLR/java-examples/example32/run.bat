@echo off

set PATH=..\..\jdk1.7.0_76\bin
set CLASSPATH=.;../../antlr-jar/antlr-complete.jar;%CLASSPATH%

echo.
echo.
echo.
echo **********************************************
echo.
echo Deleting old Java files (if any)
del *.java
del *.class
echo.
echo.

echo Running ANTLR on the lexer: MyLexer.g4
java org.antlr.v4.Tool MyLexer.g4 -no-listener -no-visitor
echo.
echo.

echo Running ANTLR on the parser: MyParser.g4
java org.antlr.v4.Tool MyParser.g4 -no-listener -no-visitor
echo.
echo.

echo Compiling the Java code that ANTLR generator (the lexer and parser code)
javac *.java
echo.
echo.

echo Running the test rig on the generated parser, using as input the string in: input.txt
echo And generating a GUI output (i.e., a parse tree graphic)
java org.antlr.v4.gui.TestRig My words -gui < input.txt

rem java org.antlr.v4.gui.TestRig MyLexer tokens -tokens  < input.txt
echo.
echo.