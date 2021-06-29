#袁世一，20190511
alias t1='java -cp ".:../myPackage/antlr/antlr-4.7.1-complete.jar" org.antlr.v4.Tool v3_compiler.g4'
alias t2='javac -cp ".:../myPackage/antlr/antlr-4.7.1-complete.jar" *.java'
alias t3='java -cp ".:../myPackage/antlr/antlr-4.7.1-complete.jar" org.antlr.v4.gui.TestRig v3_compiler s test.c -gui'

alias t11='java -cp ".:../myPackage/antlr/antlr-4.7.1-complete.jar" org.antlr.v4.Tool -visitor v3_compiler.g4'
alias t22='javac -cp ".:../myPackage/antlr/antlr-4.7.1-complete.jar" *.java'
alias t33='java -cp ".:../myPackage/antlr/antlr-4.7.1-complete.jar" org.antlr.v4.gui.TestRig v3_compiler s test.c -gui'

alias t55='java  -cp ".:../myPackage/antlr/antlr-4.7.1-complete.jar" org.antlr.v4.Tool -Dlanguage=Python3 -visitor v3_compiler.g4'
alias t66='python3 mytest.py'
alias clean='rm -rf v3_compiler*.java *.tokens *.class *.interp v3_compiler*.py __pycache__ .antlr'
