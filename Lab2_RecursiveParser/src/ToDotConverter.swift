//
//  TreeToDotConverter.swift
//  KotlinFunctionParser
//
//  Created by Сергей Фадеев on 02.12.2020.
//  Copyleft (ɔ) 2020 φλεξ. No rights reserved.
//

import Foundation

class ToDotConverter {
    let tree: Tree
    let label: String
    
    init(tree: Tree, label: String) {
        self.tree = tree
        self.label = label
    }
    
    func convertToDotGraph() -> String {
        return """
            graph
            {
            label="\(label)"
            \(tree.nodesInDotFormat())
            \(tree.edgesInDotFormat())
            }
            """
    }
}
