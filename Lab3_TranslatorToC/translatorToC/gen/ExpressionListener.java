// Generated from /Users/Fadeev/Desktop/github/translatorToC/src/Expression.g4 by ANTLR 4.8

    import TreeNodes.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParser}.
 */
public interface ExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExpressionParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExpressionParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void enterMainBlock(ExpressionParser.MainBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void exitMainBlock(ExpressionParser.MainBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#mainSubBlock}.
	 * @param ctx the parse tree
	 */
	void enterMainSubBlock(ExpressionParser.MainSubBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#mainSubBlock}.
	 * @param ctx the parse tree
	 */
	void exitMainSubBlock(ExpressionParser.MainSubBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ExpressionParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ExpressionParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#newVar}.
	 * @param ctx the parse tree
	 */
	void enterNewVar(ExpressionParser.NewVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#newVar}.
	 * @param ctx the parse tree
	 */
	void exitNewVar(ExpressionParser.NewVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#equating}.
	 * @param ctx the parse tree
	 */
	void enterEquating(ExpressionParser.EquatingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#equating}.
	 * @param ctx the parse tree
	 */
	void exitEquating(ExpressionParser.EquatingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#eqRight}.
	 * @param ctx the parse tree
	 */
	void enterEqRight(ExpressionParser.EqRightContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#eqRight}.
	 * @param ctx the parse tree
	 */
	void exitEqRight(ExpressionParser.EqRightContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(ExpressionParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(ExpressionParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(ExpressionParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(ExpressionParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(ExpressionParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(ExpressionParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#justIf}.
	 * @param ctx the parse tree
	 */
	void enterJustIf(ExpressionParser.JustIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#justIf}.
	 * @param ctx the parse tree
	 */
	void exitJustIf(ExpressionParser.JustIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(ExpressionParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(ExpressionParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(ExpressionParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(ExpressionParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ExpressionParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ExpressionParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#newLine}.
	 * @param ctx the parse tree
	 */
	void enterNewLine(ExpressionParser.NewLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#newLine}.
	 * @param ctx the parse tree
	 */
	void exitNewLine(ExpressionParser.NewLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#maybeNewLine}.
	 * @param ctx the parse tree
	 */
	void enterMaybeNewLine(ExpressionParser.MaybeNewLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#maybeNewLine}.
	 * @param ctx the parse tree
	 */
	void exitMaybeNewLine(ExpressionParser.MaybeNewLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpression(ExpressionParser.MathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpression(ExpressionParser.MathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(ExpressionParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(ExpressionParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 */
	void enterDecimalExpression(ExpressionParser.DecimalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 */
	void exitDecimalExpression(ExpressionParser.DecimalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(ExpressionParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(ExpressionParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(ExpressionParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(ExpressionParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(ExpressionParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(ExpressionParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(ExpressionParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(ExpressionParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathhExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 */
	void enterMathhExpression(ExpressionParser.MathhExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathhExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 */
	void exitMathhExpression(ExpressionParser.MathhExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparatorExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparatorExpression(ExpressionParser.ComparatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparatorExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparatorExpression(ExpressionParser.ComparatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#readVar}.
	 * @param ctx the parse tree
	 */
	void enterReadVar(ExpressionParser.ReadVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#readVar}.
	 * @param ctx the parse tree
	 */
	void exitReadVar(ExpressionParser.ReadVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#constOrVar}.
	 * @param ctx the parse tree
	 */
	void enterConstOrVar(ExpressionParser.ConstOrVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#constOrVar}.
	 * @param ctx the parse tree
	 */
	void exitConstOrVar(ExpressionParser.ConstOrVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#mathOperators}.
	 * @param ctx the parse tree
	 */
	void enterMathOperators(ExpressionParser.MathOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#mathOperators}.
	 * @param ctx the parse tree
	 */
	void exitMathOperators(ExpressionParser.MathOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(ExpressionParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(ExpressionParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ExpressionParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ExpressionParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(ExpressionParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(ExpressionParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(ExpressionParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(ExpressionParser.BoolContext ctx);
}