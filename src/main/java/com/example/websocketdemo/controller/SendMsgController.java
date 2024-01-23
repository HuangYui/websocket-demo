package com.example.websocketdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : SendMsgController
 * @Description:
 * @date : 2024/1/23 16:32
 */
@RestController
public class SendMsgController {

    @Autowired
    SimpMessagingTemplate simpMessagingTemplate;

    @GetMapping("/senMsg")
    public void senMsg(String message) {
        simpMessagingTemplate.convertAndSend("/topic/user", message);
    }
}
