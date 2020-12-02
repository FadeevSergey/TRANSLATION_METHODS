#! /bin/bash

pathToDot="/usr/local/Cellar/graphviz/2.44.1/bin/dot"
imageFormat="png"
tests=("fun foo()"
       "fun x(a: Int): UInt"
       "fun longFuncNameeeeeee()"
       "fun funcWithoutArgsWithReturn(): MyClass"
       "fun veryLongFuncNameeeeeee(first: Int, second: Double): Boolean"
       "fun f(a: Int, b: Double, c: Byte, d: Short, e: Long)"
       "fun funcName(a: Int, b: Double, c: Byte, d: Short, e: Long, f: Int, g: Double, h: Byte, i: Short, g: Long, k: Int, l: Double, m: Byte, n: Short, o: Long): ReturnType"
        )
        
number=0
if [ ! -d "./result" ]; then
    mkdir ./result
fi

mkdir .tempDir

for ix in ${!tests[*]}
do
    ((number++))
    touch ./.tempDir/.temp$number.dot
    cat ./src/LexicalAnalyzer.swift ./src/Parser.swift ./src/Token.swift ./src/Tree.swift ./src/ToDotConverter.swift ./src/main.swift | swift - "${tests[$ix]}" "/.tempDir/.temp$number.dot"
    $pathToDot -T$imageFormat ./.tempDir/.temp$number.dot > ./result/test$number.png
    rm -rf ./tempDir/.temp$number.dot
done

rm -rf .tempDir

