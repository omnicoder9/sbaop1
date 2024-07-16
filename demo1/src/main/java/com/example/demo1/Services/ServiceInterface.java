package com.example.demo1.Services;

public interface ServiceInterface {

    default String defaultMethod() {
        return "Default implementation";
    }

    String serviceMethod(String input);
}