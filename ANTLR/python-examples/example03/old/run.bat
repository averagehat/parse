@echo off

set PATH=D:\jdk1.7.0_76\bin;%PATH%
set CLASSPATH=.;../../antlr-jar/antlr-complete.jar;%CLASSPATH%

echo.
echo.
echo.
echo **********************************************
echo.

echo Running ANTLR on the lexer: MyLexer.g4
java org.antlr.v4.Tool -Dlanguage=Python2 MyLexer.g4 -no-listener -no-visitor
echo.
echo.

echo Running ANTLR on the parser: MyParser.g4
java org.antlr.v4.Tool -Dlanguage=Python2 MyParser.g4 -no-listener -no-visitor
echo.
echo.

echo I created main.py to test the parser. 
python MyParser.py input.txt
echo.
echo.