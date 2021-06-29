#coding=utf-8
#!/usr/bin/python3
#袁世一，20190511

import sys

#加入Antlr-Runtime pkg 路徑
import pathlib
pyLib = str(pathlib.Path('../myPackage/antlr/antlr4-python3-runtime-4.7.2/src'))
sys.path.append(pyLib)
sys.path.append('.')

from antlr4 import *
from v3_compilerLexer import v3_compilerLexer
from v3_compilerParser import v3_compilerParser
from v3_compilerListener import v3_compilerListener

#此部份固定
def main(argv):
    input_stream = FileStream(argv[1])
    lexer = v3_compilerLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = v3_compilerParser(stream)
    tree = parser.globalSpace()
    '''
    printer = KeyPrinter()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)
    '''
    print('=====')
    print(tree.finalAST)
    print('=====')

    f = open('ast.txt','w')
    f.write(tree.finalAST)
    f.close()

#class部份需要自行撰寫
class KeyPrinter(v3_compilerListener):
    def enterGlobalSpace(self, ctx):
        print("enter globalSpace: %s" % ctx.ID())
    def exitGlobalSpace(self, ctx):
        print("exit globalSpace: %s" % ctx.ID())


if __name__ == '__main__':
    main(sys.argv)
