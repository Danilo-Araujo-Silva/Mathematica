#!/usr/bin/python
from subprocess import *
from sys import *

command='../mathematica/src/main/proxy.m'
parameter=argv[1]

call([command,parameter])