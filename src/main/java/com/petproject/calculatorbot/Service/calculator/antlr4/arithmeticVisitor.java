// Generated from java-escape by ANTLR 4.11.1
package com.petproject.calculatorbot.Service.calculator.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link arithmeticParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface arithmeticVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link arithmeticParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(arithmeticParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(arithmeticParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(arithmeticParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingExpression(arithmeticParser.MultiplyingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticParser#powExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpression(arithmeticParser.PowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticParser#signedAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedAtom(arithmeticParser.SignedAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(arithmeticParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(arithmeticParser.ScientificContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(arithmeticParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(arithmeticParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(arithmeticParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(arithmeticParser.FuncnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticParser#add_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_sub(arithmeticParser.Add_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link arithmeticParser#mul_div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_div(arithmeticParser.Mul_divContext ctx);
}