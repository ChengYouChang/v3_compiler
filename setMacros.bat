@echo off
rem 袁世一，20190511

set path=.;..\myPackage\jdk-13.0.2\bin;..\myPackage\python-3.7.3-embed-amd64;C:\Windows\System32

doskey antlr=java  -cp ".;..\antlr-4.7.1-complete.jar" org.antlr.v4.Tool $*
doskey make=javac -cp ".;..\antlr-4.7.1-complete.jar" *.java
doskey grun=java -cp ".;..\antlr-4.7.1-complete.jar" org.antlr.v4.gui.TestRig %*

doskey t11=java -cp ".;..\myPackage\antlr\antlr-4.7.1-complete.jar" org.antlr.v4.Tool v3_compiler.g4
doskey t22=javac -cp ".;..\myPackage\antlr\antlr-4.7.1-complete.jar" *.java
doskey t33=java -cp ".;..\myPackage\antlr\antlr-4.7.1-complete.jar" org.antlr.v4.gui.TestRig v3_compiler globalSpace test.c -gui

doskey t55=java  -cp ".;..\myPackage\antlr\antlr-4.7.1-complete.jar" org.antlr.v4.Tool -Dlanguage=Python3 v3_compiler.g4
doskey t66=python main.py test.c
doskey t77=python plotTree.py

doskey clean=del v3_compiler*.java *.tokens *.class *.interp v3_compiler*.py $T rd /s/q __pycache__
doskey alias=doskey /macros
