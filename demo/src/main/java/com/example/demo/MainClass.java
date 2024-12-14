package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class MainClass {
    public void login(String username) {
        System.out.println("Logging in user: " + username);
    }

    public int calculateSum(int a, int b) {
        return a + b;
    }

    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }
}
