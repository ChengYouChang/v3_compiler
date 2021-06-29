# -*- coding: utf-8 -*-
"""
Created on Tue Jun 29 10:38:51 2021

@author: chengyou
"""

from ete3 import Tree

## Start creating tables
fin = open('ast.txt')
ast = fin.read()    # read all ast tree

# pre processing raw ANTLR output into ete3 tree format

pvt = 1
while(pvt < len(ast)):
    if(ast[pvt]=='('):
        if(ast[pvt-1]==','):
            pvt += 1
            continue
        elif(ast[pvt-1]!='('):
            ast=ast[:pvt]+','+ast[pvt:]
            pvt += 2
        else:
            pvt += 1
    else:
        pvt += 1
while('()' in ast):
    pvt = ast.find('()')
    ast = ast[:pvt+1] + 'None' +ast[pvt+1:]

# start label estimating
subProg = {}
t = Tree(ast+';', format = 1)
t.show()

print('OK')