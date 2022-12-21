package com.petproject.calculatorbot.Service;


import com.ibm.icu.impl.Pair;
import com.petproject.calculatorbot.Service.calculator.CalculatorVisitor;
import com.petproject.calculatorbot.Service.calculator.antlr4.arithmeticLexer;
import com.petproject.calculatorbot.Service.calculator.antlr4.arithmeticParser;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import org.telegram.telegrambots.meta.api.objects.Update;

@AllArgsConstructor
@Slf4j
public class EventHandler implements Runnable {


    private final Update update;
    private final CalculatorBot bot;
    private final CalculatorVisitor visitor;
    private final Parser parser;

    @Override
    public void run() {
        Pair<Command, String> message = parser.parse(update.getMessage().getText());
        long chatId = update.getMessage().getChatId();
        switch (message.first) {
            case calculate:
                bot.sendMassage(chatId, calculate(message.second));
                break;
            case set_vars:
                calculate(message.second);
                bot.sendMassage(chatId, "Your variables were written in memory");
                break;
            case show_vars:
                bot.sendMassage(chatId, visitor.getMemory().toString());
                break;
            case functions:
                bot.sendMassage(chatId, visitor.getFunctions().keySet().toString());
                break;
            case start:
                String startingText =
                        "Hi, " + update.getMessage().getChat().getFirstName() + ", nice to meet you!\n" +
                                "This bot can compute arithmetic expressions\n" +
                                "There are some rules:\n" +
                                "1. You have to put whitespace after each command which do something with your data \n" +
                                "2. If you want to create your variables, just write command /setVars " +
                                "and after you can write your them\n" +
                                "3. You have to use ';' after each definition of variables\n" +
                                "4. If you want to calculate something you just need to write command /calculate " +
                                "and after that you can write your expression \n" +
                                "Here are two examples:\n" +
                                "/set_vars x=10;y=15;z=10;\n" +
                                "/calculate x+y+z-5;";
                bot.sendMassage(chatId, startingText);
                break;
            case help:
                break;
            case unsupported:
                bot.sendMassage(chatId, "Sorry, command isn't supported");
                break;
            default:
                bot.sendMassage(chatId, "Sorry,command wasn't recognized");
        }
    }

    private String calculate(String input) {
        try {
            arithmeticLexer lexer = new arithmeticLexer(new ANTLRInputStream(input));
            arithmeticParser parser = new arithmeticParser(new CommonTokenStream(lexer));
            return visitor.visitProg(parser.prog()).toString();
        } catch (RuntimeException e) {
            log.warn(e.getMessage());
            return "This expression isn't correct";
        }
    }

}
