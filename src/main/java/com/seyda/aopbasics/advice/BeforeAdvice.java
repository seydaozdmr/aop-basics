package com.seyda.aopbasics.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("--In before Advice--");
        System.out.println("Method : "+method.getName());
        System.out.println("Target" + target.getClass().getName());
        System.out.println("There are "+args.length+ " arguments");
        System.out.println("Proceeding to the target");
    }

//    @Override
//    public void before(Method method, Object[] args, Object target) throws Throwable {
//        System.out.print("Seyda ");
//    }


}
