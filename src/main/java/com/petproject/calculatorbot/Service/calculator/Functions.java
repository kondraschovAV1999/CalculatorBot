package com.petproject.calculatorbot.Service.calculator;

import lombok.Getter;
import org.springframework.cglib.core.internal.Function;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Component
public class Functions {
    private final Map<String, Function<List<Double>, Double>> functions;

    public Functions() {
        functions = new HashMap<>();
        functions.put("sin", a -> FunctionOfOneArg.apply(a, Math::cos));
        functions.put("tan", a -> FunctionOfOneArg.apply(a, Math::tan));
        functions.put("acos", a -> FunctionOfOneArg.apply(a, Math::acos));
        functions.put("asin", a -> FunctionOfOneArg.apply(a, Math::asin));
        functions.put("atan", a -> FunctionOfOneArg.apply(a, Math::atan));
        functions.put("log", a -> FunctionOfOneArg.apply(a, Math::log10));
        functions.put("ln", a -> FunctionOfOneArg.apply(a, Math::log));
        functions.put("sqrt", a -> FunctionOfOneArg.apply(a, Math::sqrt));
        functions.put("abs", a -> FunctionOfOneArg.apply(a, Math::abs));
        functions.put("min", a -> {
            if (a.size() == 2) return Math.min(a.get(0), a.get(1));
            throw new IllegalArgumentException("There is a wrong number of args. Function min");
        });
        functions.put("max", a -> {
            if (a.size() == 2) return Math.max(a.get(0), a.get(1));
            throw new IllegalArgumentException("There is a wrong number of args. Function max");
        });
    }

    public boolean addNewFunction(String name, Function<List<Double>, Double> function) {
        if (!functions.containsKey(name)) {
            functions.put(name, function);
            return true;
        }
        return false;
    }
}
