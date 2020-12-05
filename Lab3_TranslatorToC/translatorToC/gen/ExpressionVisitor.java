// Generated from /Users/Fadeev/Desktop/github/translatorToC/src/Expression.g4 by ANTLR 4.8

    import TreeNodes.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ExpressionParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#structsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructsBlock(ExpressionParser.StructsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#funcsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncsBlock(ExpressionParser.FuncsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#mainBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainBlock(ExpressionParser.MainBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#mainSubBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainSubBlock(ExpressionParser.MainSubBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(ExpressionParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(ExpressionParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(ExpressionParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#justIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJustIf(ExpressionParser.JustIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#ifElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(ExpressionParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(ExpressionParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ExpressionParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ExpressionParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#newLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewLine(ExpressionParser.NewLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#maybeNewLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaybeNewLine(ExpressionParser.MaybeNewLineContext ctx);
}