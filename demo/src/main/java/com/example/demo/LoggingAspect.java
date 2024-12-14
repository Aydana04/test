package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.demo.MainClass.login(..))")
    public void beforeLogin() {
        System.out.println("[BEFORE] About to call login");
    }

    @After("execution(* com.example.demo.MainClass.login(..))")
    public void afterLogin() {
        System.out.println("[AFTER] login method executed");
    }

    @Around("execution(* com.example.demo.MainClass.calculateSum(..))")
    public Object aroundCalculateSum(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("[AROUND] Before calculateSum");
        long startTime = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long executionTime = System.currentTimeMillis() - startTime;
        System.out.println("[AROUND] After calculateSum");
        System.out.println("Execution time: " + executionTime + "ms");

        return result;
    }

    @Before("execution(* com.example.demo.MainClass.printMessage(..))")
    public void beforePrintMessage() {
        System.out.println("[BEFORE] About to call printMessage");
    }

    @After("execution(* com.example.demo.MainClass.printMessage(..))")
    public void afterPrintMessage() {
        System.out.println("[AFTER] printMessage method executed");
    }
}
