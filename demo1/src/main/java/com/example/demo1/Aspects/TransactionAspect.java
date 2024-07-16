package com.example.demo1.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.JoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
@Component
public class TransactionAspect {

//    @Around("execution(* com.example.service..*(..))")
//    @Around("execution(* com.example.demo1.Services..*(..))")
//    @Around("execution(* com.example.demo1.Services.*.*(..))")
    @Around("execution(* com.example.demo1.Services.ServiceInterface.*(..)")
    public Object manageTransaction(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Transaction start");
        Object result = joinPoint.proceed();
        System.out.println("Transaction end");
        return result;
    }

//    @Autowired
//    private PlatformTransactionManager transactionManager;
//
//    @Around("execution(* com.example.service.*.*(..))")
//    public Object manageTransaction(ProceedingJoinPoint joinPoint) throws Throwable {
//        TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());
//        try {
//            Object result = joinPoint.proceed();
//            transactionManager.commit(status);
//            return result;
//        } catch (Exception e) {
//            transactionManager.rollback(status);
//            throw e;
//        }
//    }
}