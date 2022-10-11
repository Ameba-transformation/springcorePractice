package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class MessageSendService {

    private final MessageSender messageSender1;
    private final MessageSender messageSender2;

//    public MessageSendService(MessageSender messageSender) {
//        this.messageSender = messageSender;
//    }

    public MessageSendService(MessageSender emailMessageSender, MessageSender smsMessageSender) {
        this.messageSender1 = emailMessageSender;
        this.messageSender2 = smsMessageSender;
    }

    public void doSendMessage(){
        messageSender1.sendMessage(new User("abcde", "010-1234-5678"),"hello");
        messageSender2.sendMessage(new User("abcde", "010-1234-5678"),"hello");
    }
}
