//
//  main.swift
//  KotlinFunctionParser
//
//  Created by Сергей Фадеев on 01.12.2020.
//  Copyleft (ɔ) 2020 φλεξ. No rights reserved.
//

import Foundation

assert(CommandLine.arguments.count >= 3)

let expr = CommandLine.arguments[1]
let file = CommandLine.arguments[2]
let parser = Parser()
let tree = parser.parse(expression: expr)
let converter = ToDotConverter(tree: tree, label: expr)
let result = converter.convertToDotGraph()

var dir = FileManager.default.currentDirectoryPath

let fileURL = dir + file

do {
    try result.write(to: URL(fileURLWithPath: fileURL), atomically: false, encoding: .utf8)
}
catch {
    print(error)
}
