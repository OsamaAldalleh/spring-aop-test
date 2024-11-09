package com.osama.spring_aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static int count = 0;

    @Before("allGetters()")
    public void loggingAdvice(JoinPoint joinPoint) {
        System.out.println("First loggingAdvice run. Get Method called: " + joinPoint.getSignature().getName() + ", Count is: " + ++count);
    }

    @After("allGetters()")
    public void secondAdvice(JoinPoint joinPoint) {
        System.out.println("SecondAdvice run. Get Method called: " + joinPoint.getSignature().getName());
    }

    @Pointcut("execution (* com.osama..get*())")
    public void allGetters() {
    }


}
