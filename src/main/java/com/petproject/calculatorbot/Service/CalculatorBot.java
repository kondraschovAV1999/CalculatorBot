package com.petproject.calculatorbot.Service;


import com.petproject.calculatorbot.Service.calculator.CalculatorVisitor;
import com.petproject.calculatorbot.Service.calculator.Functions;
import com.petproject.calculatorbot.config.BotConfig;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Component
@Slf4j
public class CalculatorBot extends TelegramLongPollingBot {

    private final BotConfig config;
    private final Functions functions;
    private final ConcurrentMap<Long, CalculatorVisitor> visitorMap;

    public CalculatorBot(BotConfig config, Functions functions) {
        this.config = config;
        this.functions = functions;
        this.visitorMap = new ConcurrentHashMap<>();
    }

    @Override
    public String getBotUsername() {
        return config.getBotName();
    }

    @Override
    public String getBotToken() {
        return config.getToken();
    }

    @Override
    public void onUpdateReceived(Update update) {

        visitorMap.putIfAbsent(
                update.getMessage().getChatId(),
                new CalculatorVisitor(functions.getFunctions()));

        new Thread(new EventHandler(
                update,
                this,
                visitorMap.get(update.getMessage().getChatId()),
                new MessageParser())).start();
    }

    public void sendMassage(long chatId, String text) {
        try {
            SendMessage message = new SendMessage();
            message.setChatId(chatId);
            message.setText(text);
            execute(message);
        } catch (TelegramApiException e) {
            log.warn(e.getMessage());
        }
    }

}
