@echo off

set CLASSPATH=.;../../antlr-jar/antlr-complete.jar;%CLASSPATH%

java org.antlr.v4.runtime.misc.TestRig %*

rem grun Hello r -tokens
rem grun Hello r -tree
rem grun Hello r -gui