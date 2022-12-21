// Generated from java-escape by ANTLR 4.11.1
package com.petproject.calculatorbot.Service.calculator.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link arithmeticParser}.
 */
public interface arithmeticListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link arithmeticParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(arithmeticParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(arithmeticParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(arithmeticParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(arithmeticParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(arithmeticParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(arithmeticParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(arithmeticParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(arithmeticParser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowExpression(arithmeticParser.PowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowExpression(arithmeticParser.PowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void enterSignedAtom(arithmeticParser.SignedAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void exitSignedAtom(arithmeticParser.SignedAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(arithmeticParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(arithmeticParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientific(arithmeticParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientific(arithmeticParser.ScientificContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(arithmeticParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(arithmeticParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(arithmeticParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(arithmeticParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(arithmeticParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(arithmeticParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(arithmeticParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(arithmeticParser.FuncnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticParser#add_sub}.
	 * @param ctx the parse tree
	 */
	void enterAdd_sub(arithmeticParser.Add_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticParser#add_sub}.
	 * @param ctx the parse tree
	 */
	void exitAdd_sub(arithmeticParser.Add_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link arithmeticParser#mul_div}.
	 * @param ctx the parse tree
	 */
	void enterMul_div(arithmeticParser.Mul_divContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticParser#mul_div}.
	 * @param ctx the parse tree
	 */
	void exitMul_div(arithmeticParser.Mul_divContext ctx);
}