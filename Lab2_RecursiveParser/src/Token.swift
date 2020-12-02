//
//  Tokens.swift
//  KotlinFunctionParser
//
//  Created by Сергей Фадеев on 01.12.2020.
//  Copyleft (ɔ) 2020 φλεξ. No rights reserved.
//

import Foundation
 
enum Token {
    case varName(name: String)
    case type(typeName: String)
    case fun
    case colon
    case comma
    case leftBracket
    case rightBracket
    case end
}
