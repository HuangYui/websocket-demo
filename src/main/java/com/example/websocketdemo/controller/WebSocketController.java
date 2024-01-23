package com.example.websocketdemo.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {



    @MessageMapping("/message")
    @SendTo("/topic/messages")
    public String handle(String message) {
        return "收到消息: " + message;
    }


}