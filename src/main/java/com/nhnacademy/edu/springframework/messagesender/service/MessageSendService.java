package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class MessageSendService {

    private MessageSender messageSender;

    public MessageSendService(){

    }

    public void setSms(MessageSender messageSender) {
        System.out.println("setMessageSend!!!!");
        this.messageSender = messageSender;
    }

//    public MessageSendService(MessageSender messageSender) {
//        this.messageSender = messageSender;
//    }

    public void doSendMessage(){
        messageSender.sendMessage(new User("abcde", "010-1234-5678"),"hello");
    }
}
