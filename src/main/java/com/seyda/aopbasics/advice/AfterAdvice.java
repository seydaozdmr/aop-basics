package com.seyda.aopbasics.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("--After Advice--");
        System.out.println("Method "+method.getName());
        System.out.println("Target : "+target.getClass().getName());
        System.out.println("There are "+args.length+" arguments");
        System.out.println("Proceeding to the target");
    }
//    @Override
//    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
//        System.out.print(" java");
//        System.out.println();
//    }
}
