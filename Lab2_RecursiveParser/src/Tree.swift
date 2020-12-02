//
//  Tree.swift
//  KotlinFunctionParser
//
//  Created by Сергей Фадеев on 02.12.2020.
//  Copyleft (ɔ) 2020 φλεξ. No rights reserved.
//

import Foundation

struct Tree{
    private let node: String
    private let children: [Tree]
    private(set) var uniqID: String
    
    init(node: String) {
        self.init(node: node, children: [])
    }
    
    init(node: String, children: [Tree]) {
        self.node = node
        self.children = children
        self.uniqID = node +
            String(Int(Date().timeIntervalSince1970 * 10000)) +
            String(Int.random(in: 0...Int.max))
    }
  
    public func nodesInDotFormat() -> String {
        var result = self.uniqID + " " + "[label=\"\(node)\"] ;\n"
        for tree in children {
            result += tree.nodesInDotFormat()
        }
        return result
    }
    
    public func edgesInDotFormat() -> String {
        var result = ""
        for tree in children {
            result += uniqID + " -- " + tree.uniqID + " ; \n"
            result += tree.edgesInDotFormat()
        }
        return result
    }
    
}
