package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[]args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:/beans.xml");

        User user = new User("hello", "010");

        String message = "what";

        System.out.println("-------------");
        context.getBean("sms", MessageSender.class).sendMessage(user, message);
        context.getBean("sms", MessageSender.class).sendMessage(user, message);
        System.out.println("-------------");
        context.getBean("email", MessageSender.class).sendMessage(user, message);
        context.getBean("email", MessageSender.class).sendMessage(user, message);
        System.out.println("-------------");

        context.close();

    }

}
