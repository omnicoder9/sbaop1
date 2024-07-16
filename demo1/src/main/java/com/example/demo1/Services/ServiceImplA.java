package com.example.demo1.Services;

import com.example.demo1.Aspects.CustomTransactional;
import org.springframework.stereotype.Component;
@Component
public class ServiceImplA implements ServiceInterface {

    @Override
//    @CustomTransactional
    public String serviceMethod(String input) {
        // Implementation of serviceMethod
        System.out.println("heedddd1212");
        return "ServiceImplA: " + input;
    }
}