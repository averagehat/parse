@echo off

set CLASSPATH=.;../../antlr-jar/antlr-complete.jar;%CLASSPATH%

java org.antlr.v4.runtime.misc.TestRig My message -gui < input.txt