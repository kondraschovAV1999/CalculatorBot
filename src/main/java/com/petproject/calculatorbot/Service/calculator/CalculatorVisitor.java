package com.petproject.calculatorbot.Service.calculator;


import com.petproject.calculatorbot.Service.calculator.antlr4.arithmeticBaseVisitor;
import com.petproject.calculatorbot.Service.calculator.antlr4.arithmeticParser;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.core.internal.Function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Getter
@Slf4j
public class CalculatorVisitor extends arithmeticBaseVisitor<Double> {

    private final Map<String, Function<List<Double>, Double>> functions;
    private final Map<String, Double> memory;

    public CalculatorVisitor(Map<String, Function<List<Double>, Double>> functions) {
        this.functions = functions;
        memory = new HashMap<>();
    }

    @Override
    public Double visitProg(arithmeticParser.ProgContext ctx) {
        ctx.equation().forEach(this::visit);
        return ctx.expression() != null ? visit(ctx.expression()) : 0;
    }

    @Override
    public Double visitEquation(arithmeticParser.EquationContext ctx) {
        memory.put(ctx.variable().getText(), visit(ctx.expression()));
        return 0d;
    }

    @Override
    public Double visitFunction(arithmeticParser.FunctionContext ctx) {
        if (functions.containsKey(ctx.funcname().getText())) {
            List<Double> args = new ArrayList<>();
            ctx.expression().forEach(
                    expr -> args.add(visit(expr))
            );
            return functions.get(ctx.funcname().getText()).apply(args);
        }
        String warn = "Function " + ctx.funcname().getText() + " isn't supported";
        log.warn(warn);
        throw new RuntimeException(warn);
    }

    @Override
    public Double visitExpression(arithmeticParser.ExpressionContext ctx) {
        if (ctx.expression() != null) {
            switch (ctx.add_sub().getText()) {
                case "+":
                    return visit(ctx.multiplyingExpression()) + visit(ctx.expression());
                case "-":
                    return visit(ctx.multiplyingExpression()) - visit(ctx.expression());
            }
        }
        return visit(ctx.multiplyingExpression());
    }

    @Override
    public Double visitMultiplyingExpression(arithmeticParser.MultiplyingExpressionContext ctx) {
        if (ctx.multiplyingExpression() != null) {
            switch (ctx.mul_div().getText()) {
                case "*":
                    return visit(ctx.powExpression()) * visit(ctx.multiplyingExpression());
                case "/":
                    return visit(ctx.powExpression()) / visit(ctx.multiplyingExpression());
            }
        }
        return visit(ctx.powExpression());
    }

    @Override
    public Double visitPowExpression(arithmeticParser.PowExpressionContext ctx) {
        if (ctx.powExpression() != null) {
            return Math.pow(visit(ctx.signedAtom()), visit(ctx.powExpression()));
        }
        return visit(ctx.signedAtom());
    }

    @Override
    public Double visitSignedAtom(arithmeticParser.SignedAtomContext ctx) {

        if (ctx.signedAtom() != null) {
            if (ctx.PLUS() != null) return visit(ctx.signedAtom());
            return -visit(ctx.signedAtom());
        }

        if (ctx.atom() != null) return visit(ctx.atom());

        if (ctx.function() != null) return visit(ctx.function());

        String warn = "Error in signed atom" + ctx.getText();
        log.warn(warn);
        throw new RuntimeException(warn);
    }

    @Override
    public Double visitAtom(arithmeticParser.AtomContext ctx) {
        if (ctx.expression() != null && ctx.LPAREN() != null && ctx.RPAREN() != null)
            return visit(ctx.expression());

        if (ctx.scientific() != null) return visit(ctx.scientific());

        if (ctx.constant() != null) return visit(ctx.constant());

        if (ctx.variable() != null) return visit(ctx.variable());

        String warn = "Error in  atom" + ctx.getText();
        log.warn(warn);
        throw new RuntimeException(warn);
    }

    @Override
    public Double visitScientific(arithmeticParser.ScientificContext ctx) {
        String[] number = ctx.SCIENTIFIC_NUMBER().getText().split("[eE]");
        double multiplier = number.length > 1 ? Math.pow(10, Double.parseDouble(number[1])) : 1;
        return Double.parseDouble(number[0]) * multiplier;
    }

    @Override
    public Double visitConstant(arithmeticParser.ConstantContext ctx) {
        switch (ctx.getText()) {
            case "pi":
                return Math.PI;
            case "e":
                return Math.E;
        }
        String warn = "Constant " + ctx.getText() + " isn't supported";
        log.warn(warn);
        throw new RuntimeException(warn);
    }

    @Override
    public Double visitVariable(arithmeticParser.VariableContext ctx) {
        if (memory.containsKey(ctx.getText())) return memory.get(ctx.getText());
        String warn = ctx.getText() + " is an undefined variable";
        log.warn(warn);
        throw new RuntimeException(warn);
    }
}
