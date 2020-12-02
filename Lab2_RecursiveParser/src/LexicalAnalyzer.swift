//
//  Lexer.swift
//  KotlinFunctionParser
//
//  Created by Сергей Фадеев on 01.12.2020.
//  Copyleft (ɔ) 2020 φλεξ. No rights reserved.
//

import Foundation

class LexicalAnalyzer{
    private let expression: String
    private var curPosition: Int
    private(set) var curChar: Character?
    private(set) var curToken: Token?
    
    init(expression: String){
        self.expression = expression
        self.curPosition = -1
        
        nextChar()
    }
    
    public func nextToken() -> Token {
        while curChar!.isWhitespace {
            nextChar()
        }
        
        if curPosition == expression.count {
            curToken = Token.end
        } else {
            switch curChar{
            case ":":
                nextChar()
                curToken = Token.colon
            case ",":
                nextChar()
                curToken = Token.comma
            case "(":
                nextChar()
                curToken = Token.leftBracket
            case ")":
                nextChar()
                curToken = Token.rightBracket
            default:
                let nextWord: String = readWord()
                if nextWord != "" {
                    if nextWord[0].isUppercase {
                        curToken = Token.type(typeName: nextWord)
                    } else {
                        if nextWord == "fun" {
                            curToken = Token.fun
                        } else {
                            curToken = Token.varName(name: nextWord)
                        }
                    }
                } else {
                    print("Err")
                }
            }
        }
        
        return curToken!
    }
    
    private func nextChar(){
        curPosition += 1
        
        if curPosition < expression.count {
            curChar = expression[curPosition]
        } else {
            curChar = "$"
        }
    }

    private func readWord() -> String {
        var result = "" + String(curChar!)
        while curPosition < expression.count {
            nextChar()
            if curChar != nil && curChar!.isLetter {
                result = result + String(curChar!)
            } else {
                break;
            }
        }

        return result
    }
}

extension String {
  subscript (i: Int) -> Character {
    return self[index(startIndex, offsetBy: i)]
  }
}
