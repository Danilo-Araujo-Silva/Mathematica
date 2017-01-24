from subprocess import *
from sys import *

command='../mathematica/proxy.m'
parameter=argv[1]

call([command,parameter])