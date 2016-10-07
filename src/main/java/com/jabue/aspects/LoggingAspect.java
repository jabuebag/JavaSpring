package com.jabue.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by Kris on 2016-10-06.
 */
@EnableAspectJAutoProxy
@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.jabue.service.UserService.getAllUsers(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("logBefore() is running!");
    }

    @After("execution(* com.jabue.service.UserService.getAllUsers(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("logAfter() is running!");
    }

    @AfterReturning(
            pointcut = "execution(* com.jabue.service.UserService.getAllUsers(..))",
            returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {

        System.out.println("logAfterReturning() is running!");
        System.out.println(result);

    }
}
