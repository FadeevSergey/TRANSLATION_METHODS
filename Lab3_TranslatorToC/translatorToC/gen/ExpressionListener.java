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
	 * Enter a parse tree produced by {@link ExpressionParser#structsBlock}.
	 * @param ctx the parse tree
	 */
	void enterStructsBlock(ExpressionParser.StructsBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#structsBlock}.
	 * @param ctx the parse tree
	 */
	void exitStructsBlock(ExpressionParser.StructsBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#funcsBlock}.
	 * @param ctx the parse tree
	 */
	void enterFuncsBlock(ExpressionParser.FuncsBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#funcsBlock}.
	 * @param ctx the parse tree
	 */
	void exitFuncsBlock(ExpressionParser.FuncsBlockContext ctx);
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
	 * Enter a parse tree produced by {@link ExpressionParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ExpressionParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ExpressionParser.ConditionContext ctx);
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
}