package com.example.demo1.Services;

import com.example.demo1.Aspects.CustomTransactional;
import org.springframework.stereotype.Component;
import com.example.demo1.Aspects.CustomTransactionalAspect;
@Component
public class ServiceImplB extends ServiceImplA {

    @Override
    @CustomTransactional
    public String serviceMethod(String input) {
        // Implementation of serviceMethod in ServiceImplB
        return "ServiceImplB: " + input;
    }
}