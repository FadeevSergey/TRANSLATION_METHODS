//
//  Parser.swift
//  KotlinFunctionParser
//
//  Created by Сергей Фадеев on 01.12.2020.
//  Copyleft (ɔ) 2020 φλεξ. No rights reserved.
//

import Foundation

class Parser {
    private var lexer: LexicalAnalyzer?
    
    func parse(expression: String) -> Tree {
        lexer = LexicalAnalyzer(expression: expression)
        _ = lexer?.nextToken()
        return parseExpression()
    }
    
    private func parseExpression() -> Tree {
        var result: Tree?
        switch lexer!.curToken!{
        case Token.fun:
            _ = lexer?.nextToken()
            let exprTail = parseExpressionTail()
            _ = lexer?.nextToken()
            switch lexer!.curToken!{
            case Token.end:
                result = Tree(node: "Expression",
                              children: [
                                Tree(node: "fun"),
                                exprTail,
                                Tree(node: "end")])
            default:
                print("Err")
            }
        default:
            print("Err")
        }
        
        return result ?? Tree(node: "")
    }
    
    
    private func parseExpressionTail() -> Tree {
        var result: Tree?
        switch lexer!.curToken!{
        case .varName(let name):
            _ = lexer!.nextToken()
            let param = parseParametersWithBrackets()
            
            _ = lexer!.nextToken()
            
            let returnExpr = parseReturnExpr()
            
            result = Tree(node: "expressionTail",
                          children: [
                            Tree(node: "funcName", children: [Tree(node: name)]),
                            param,
                            returnExpr
                          ])
        default:
            print("Err")
        }
        
        return result ?? Tree(node: "")
    }
    
    private func parseParametersWithBrackets() -> Tree {
        var result: Tree?
        
        switch lexer!.curToken! {
        case .leftBracket:
            switch lexer!.nextToken() {
            case .rightBracket:
                result = Tree(node: "parametersWithBrackets", children: [Tree(node: "leftBracket"), Tree(node: "rightBracket")])
            case .varName(let varName):
                let colonTypeParamTail = parseColonTypeParamTail()
                result = Tree(node: "parametersWithBrackets",
                              children: [
                                Tree(node: "leftBracket"),
                                Tree(node: "variable", children: [Tree(node: varName)]),
                                colonTypeParamTail
                              ])
            default:
                print("Err")
            }
        default:
            print("Err")
        }
        
        return result ?? Tree(node: "")
    }
    
    private func parseParametersTail() -> Tree {
        var result: Tree?
        
        switch lexer!.curToken! {
        case .rightBracket:
            result = Tree(node: "rightBracket")
        case .comma:
            switch lexer!.nextToken(){
            case .varName(let varName):
                let colonTypeParamTail = parseColonTypeParamTail()
                result = Tree(node: "paramTail",
                              children: [
                                Tree(node: "comma"),
                                Tree(node: "varName", children: [Tree(node: varName)]),
                                colonTypeParamTail
                              ])
            default:
                print("Err")
            }
            
        default:
            print("Err")
        }
        
        return result ?? Tree(node: "")
    }
    
    private func parseColonTypeParamTail() -> Tree {
        var result: Tree?
        
        switch lexer!.nextToken() {
        case .colon:
            switch lexer!.nextToken() {
            case .type(let type):
                _ = lexer!.nextToken()
                
                let paramTail = parseParametersTail()
                
                result = Tree(node: "colonTypeParamTail",
                              children:
                                [
                                 Tree(node: "colon"),
                                 Tree(node: "type", children: [Tree(node: type)]),
                                 paramTail
                                ])
            default:
                print("Err")
            }
        default:
            print("Err")
        }
        
        return result ?? Tree(node: " ")
    }
    
    private func parseReturnExpr() -> Tree {
        var result: Tree?
        switch lexer!.curToken!{
        case .end:
            result = Tree(node: "returnExpr", children: [Tree(node: "eps")])
        case .colon:
            switch lexer!.nextToken() {
            case Token.type(let name):
                result = Tree(node: "returnExpr",
                              children: [
                                Tree(node: "colon"),
                                Tree(node: "type", children: [Tree(node: name)])
                              ])
            default:
                print("Err")
            }
        default:
            print("Err")
        }
        
        return result ?? Tree(node: "")
    }
    
}
