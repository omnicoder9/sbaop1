package com.example.demo1;

import com.example.demo1.Services.ServiceInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.demo1.Services.ServiceImplA;
import com.example.demo1.Services.ServiceInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

//@SpringBootApplication
@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo1")
@EnableAspectJAutoProxy
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);

//		ServiceInterface service = context.getBean(ServiceImplA.class);
//		service.serviceMethod("test");


	}

}
