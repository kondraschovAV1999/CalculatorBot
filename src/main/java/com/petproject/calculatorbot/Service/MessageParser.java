package com.petproject.calculatorbot.Service;

import com.ibm.icu.impl.Pair;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
@Slf4j
public class MessageParser implements Parser {

    public static void main(String[] args) {
        MessageParser parser = new MessageParser();
        Pair<Command, String> result = parser.parse("/set_vars x=10;y=15;z=10;");
        System.out.println(result.first.getText() + " " + result.second);
    }

    public Pair<Command, String> parse(String inString) {
        Matcher matcher = Pattern.compile("(/[a-z]+_?[a-z]*\\s*)").matcher(inString);
        String command = "";
        if (matcher.find()) command = matcher.group().trim();
        String expression = inString.replace(command, "").trim();
        return Pair.of(getCommand(command), expression);
    }

    private Command getCommand(String inString) {
        try {
            return Command.valueOf(inString.replace("/", ""));
        } catch (IllegalArgumentException e) {
            log.warn(e.getMessage() + "\nCommand wasn't recognized " + inString);
            return Command.unsupported;
        }
    }

}
