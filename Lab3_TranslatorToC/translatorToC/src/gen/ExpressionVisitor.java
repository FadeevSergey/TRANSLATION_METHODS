package gen;// Generated from /Users/Fadeev/Desktop/github/TRANSLATION_METHODS/Lab3_TranslatorToC/translatorToC/src/Expression.g4 by ANTLR 4.8

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
	 * Visit a parse tree produced by {@link ExpressionParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ExpressionParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#newVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewVar(ExpressionParser.NewVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#equating}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquating(ExpressionParser.EquatingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#eqRight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqRight(ExpressionParser.EqRightContext ctx);
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
	 * Visit a parse tree produced by {@link ExpressionParser#doWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhile(ExpressionParser.DoWhileContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#mathExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpression(ExpressionParser.MathExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(ExpressionParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(ExpressionParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(ExpressionParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(ExpressionParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(ExpressionParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathhExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathhExpression(ExpressionParser.MathhExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparatorExpression}
	 * labeled alternative in {@link ExpressionParser#logExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparatorExpression(ExpressionParser.ComparatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ExpressionParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#readVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadVar(ExpressionParser.ReadVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#constOrVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstOrVar(ExpressionParser.ConstOrVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#mathOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOperators(ExpressionParser.MathOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(ExpressionParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ExpressionParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(ExpressionParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(ExpressionParser.BoolContext ctx);
}