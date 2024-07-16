package com.example.demo1.Aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
@Aspect
@Component
@Order(1)
public class CustomTransactionalAspect {

    @Autowired
    private LoggingAspect loggingAspect;

    @Autowired
    private TransactionAspect transactionAspect;

//    @Around("@annotation(com.example.annotation.CustomTransactional)")

//    @Around("@annotation(CustomTransactional)")
//    @Around("@annotation(com.example.demo1.Aspects.CustomTransactional)")

    @Around("@annotation(com.example.demo1.Aspects.CustomTransactional)")
    public Object applyCustomTransaction(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("hEredddd");
        loggingAspect.logBefore(joinPoint);
        System.out.println("custom transactional 888");
        return transactionAspect.manageTransaction(joinPoint);
    }
}