package com.nhnacademy.edu.springframework.messagesender;

public class User {
    final String email;

    final String phoneNumber;

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public User(String email, String phoneNumber){
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
