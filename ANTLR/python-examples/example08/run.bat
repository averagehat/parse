@echo off

set PATH=../../jdk1.7.0_76/bin;../../Python27/Scripts;../../Python27;%PATH%
set CLASSPATH=.;../../antlr-jar/antlr-complete.jar;%CLASSPATH%

echo.
echo.
echo.
echo **********************************************
echo.

echo Running ANTLR on the lexer: MyLexer.g4
java org.antlr.v4.Tool -Dlanguage=Python2 MyLexer.g4 -listener 
echo.
echo.

echo Running ANTLR on the parser: MyParser.g4
java org.antlr.v4.Tool -Dlanguage=Python2 MyParser.g4 -listener
echo.
echo.

echo MyParser.py input.txt 
python main.py input.txt
echo.
echo.