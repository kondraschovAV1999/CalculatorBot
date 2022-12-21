package com.petproject.calculatorbot.Service.calculator;

import org.springframework.cglib.core.internal.Function;

import java.util.List;

public class FunctionOfOneArg {
    public static Double apply(List<Double> args, Function<Double, Double> function) {
        if (args.size() == 1) {
            return function.apply(args.get(0));
        }
        throw new IllegalArgumentException("There is a wrong number of args. Function "
                + function.getClass().getSimpleName() +
                " It was expected one arg.");
    }

}
