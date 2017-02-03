# Mathematica

A proposal to integrate Mathematica with several programming languages like Java, Python, PHP, Ruby, etc.

## How to use

1. Install Mathematica on your machine;
2. Check if the Mathematica command line is working:
	1. Type `MathKernel`;
	2. Write `1+1`;
	3. Press `Enter` and check the result;
	4. Type `Ctrl+D` to quit.
3. Check if the MathematicaScript path is correct for your environment in the file `src/main/mathematica/proxy.m`:
	1. If the path `#!/usr/local/bin/MathematicaScript` is not the correct one for your envirnonment you need to update it first.
4. Choose your favorite language:
  1. Java:
    1. Install Java and check if the installation is ok;
    2. Go to `src/main/java`;
    3. Type `java Proxy Zeta[2]`;
    4. Check if the result is correct.
  2. PHP:
    1. Install PHP and check if the installation is ok;
    2. Go to `src/main/php`;
    3. Type `php proxy.php Zeta[2]`;
    4. Check if the result is correct.
  3. Python:
    1. Install Python and check if the installation is ok;
    2. Go to `src/main/python`;
    3. Type `python proxy.py Zeta[2]`;
    4. Check if the result is correct.
  4. Ruby:
    1. Install Ruby and check if the installation is ok;
    2. Go to `src/main/ruby`;
    3. Type `ruby proxy.rb Zeta[2]`;
    4. Check if the result is correct.

## About the author
[Danilo Araújo Silva (silva.danilo.araujo@gmail.com)](https://docs.google.com/document/d/1jcflnEmzOL6t-LWoXQrx0mbNNaSoyA8n9F30msUXMuc#).
