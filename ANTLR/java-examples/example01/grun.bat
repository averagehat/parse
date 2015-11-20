@echo off

set PATH=..\..\jdk1.7.0_76\bin
set CLASSPATH=.;../../antlr-jar/antlr-complete.jar;%CLASSPATH%

java org.antlr.v4.runtime.misc.TestRig My message -gui < input.txt