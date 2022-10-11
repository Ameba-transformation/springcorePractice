package com.nhnacademy.edu.springframework.messagesender;

public class MessageSendService {

    private final MessageSender messageSender;

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage(){
        messageSender.sendMessage(new User("abcde", "010-1234-5678"),"hello");
    }
}
