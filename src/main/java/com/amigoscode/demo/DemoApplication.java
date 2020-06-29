package com.amigoscode.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        printMessage("Hello, how are you?");
        printMessage("I'm fine.");
    }

    private static void printMessage(String greetings) {
        // alt + shift + v - extract into variable
        // ctrl + alt + n - inline variable
        System.out.println(greetings);
        // expand selection - alt + shift + .
        // shrink selection - alt + shift + ,
        // alt + shift + m - extract to method
        // ctrl + alt + p - extract to parameter
    }
}
