package com.petproject.calculatorbot.Service;

import lombok.Getter;

@Getter
public enum Command {
    calculate("/calculate"),
    show_vars("/show_vars"),
    start("/start"),
    set_vars("/set_vars"),
    help("/help"),
    functions("/functions"),
    unsupported("");

    private final String text;

    Command(String s) {
        text = s;
    }
}
