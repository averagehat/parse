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