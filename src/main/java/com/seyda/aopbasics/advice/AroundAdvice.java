package com.seyda.aopbasics.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("Hi ");
        Object returnedValue=invocation.proceed();
        System.out.println(" , how do you do?");
        return returnedValue;
    }
}
