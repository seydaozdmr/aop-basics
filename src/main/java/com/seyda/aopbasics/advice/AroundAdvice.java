package com.seyda.aopbasics.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class AroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("--Before--");
        Method method = invocation.getMethod();
        System.out.println("Method : "+method.getName());
        System.out.println("Target: "+invocation.getClass().getName());
        Object[] args = invocation.getArguments();
        int length=args.length;
        System.out.println("There are "+length+" arguments");
        System.out.println("Proceeding method");
        long start = System.currentTimeMillis();

        Object returnedValue=invocation.proceed();

        long end = System.currentTimeMillis();
        System.out.println("\n Just returned from method");
        System.out.println("in "+(end-start)+" ms");
        System.out.println("Return valur "+returnedValue);
        System.out.println("--After--");
        return  returnedValue;
    }
//    @Override
//    public Object invoke(MethodInvocation invocation) throws Throwable {
//        System.out.println("Hi ");
//        Object returnedValue=invocation.proceed();
//        System.out.println(" , how do you do?");
//        return returnedValue;
//    }
}
