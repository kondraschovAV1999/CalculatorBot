package com.petproject.calculatorbot.Service;

import com.ibm.icu.impl.Pair;


public interface Parser {
    Pair<Command, String> parse(String inString);
}
