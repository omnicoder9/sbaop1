package com.example.demo1;
import com.example.demo1.Services.ServiceImplA;
import com.example.demo1.Services.ServiceImplB;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        ServiceImplA serviceA = new ServiceImplA();
        ServiceImplB serviceB = new ServiceImplB();
        String a = serviceA.serviceMethod("SERVICE A INPUT");
        String b = serviceB.serviceMethod("SERVICE B INPUT");
        System.out.println(a);
        System.out.println(b);
        return "Hello, World 7!";
    }
}
