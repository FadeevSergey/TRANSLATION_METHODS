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
        case .end:
            result = Tree(node: "eps")
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
    
    private func parseReturnExpr() -> Tree {
        var result: Tree?
        switch lexer!.curToken!{
        case .end:
            result = Tree(node: "returnExpr", children: [Tree(node: "eps")])
        case .colon:
            let type = parseType()

            let paramTail = parseParametersTail()
            
            result = Tree(node: "returnExpr",
                          children:
                            [
                             Tree(node: "colon"),
                             type,
                             paramTail
                            ])
            
        default:
            print("Err")
        }
        
        return result ?? Tree(node: "")
    }
    
    private func parseColonTypeParamTail() -> Tree {
        var result: Tree?
        
        switch lexer!.nextToken() {
        case .colon:
            let type = parseType()

            let paramTail = parseParametersTail()
            
            result = Tree(node: "colonTypeParamTail",
                          children:
                            [
                             Tree(node: "colon"),
                             type,
                             paramTail
                            ])
        default:
            print("Err")
        }
        
        return result ?? Tree(node: " ")
    }
    
    private func parseType() -> Tree {
        var result: Tree?
        
        switch lexer!.nextToken() {
        case .type(let name):
            _ = lexer!.nextToken()
            ///////////////////////////
            let typeTail = parseTypeTail()
            switch lexer!.curToken! {
            case .comma, .rightBracket, .rightTrBracket, .end:
                result = Tree(node: "parseType",
                              children: [
                                Tree(node: "type", children: [Tree(node: name)]),
                                typeTail
                              ])
            
            default:
                print("Err parseType2")
            }
            
        default:
            print("Err parseType1")
        }
        return result ?? Tree(node: " ")
    }
    
    private func parseTypeTail() -> Tree {
        var result: Tree?
        
        switch lexer!.curToken! {
        case .comma, .rightTrBracket, .rightBracket, .end:
            result = Tree(node: "eps")
        case .leftTrBracket:
            
            let type = parseType()
            
            switch lexer!.nextToken() {
            case .comma, .rightBracket, .rightTrBracket, .end:
                result = Tree(node: "parseTypeTail", children: [
                    Tree(node: "leftTrBracket"),
                    type,
                    Tree(node: "rightTrBracket")
                ])
            default:
                print("Err parseTypeTail2")
            }
        default:
            print("Err parseTypeTail1")
        }
        return result ?? Tree(node: " ")
    }
}
