package com.example.online.store.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceAspect {

    @Around("execution(* com.example.repository.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object proceed = joinPoint.proceed(); // Выполнение метода

        long executionTime = System.currentTimeMillis() - start;
        System.out.println(joinPoint.getSignature() + " выполнен за " + executionTime + " мс");

        return proceed;
    }
}
