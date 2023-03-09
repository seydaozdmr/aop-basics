package com.seyda.aopbasics.example;

import com.seyda.aopbasics.advice.AfterAdvice;
import com.seyda.aopbasics.advice.AroundAdvice;
import com.seyda.aopbasics.advice.BeforeAdvice;
import com.seyda.aopbasics.contact.Greeter;
import com.seyda.aopbasics.impl.Hello;
import com.seyda.aopbasics.impl.Selam;
import org.springframework.aop.framework.ProxyFactory;

public class AopExample {

    public static void main(String[] args) {
        Greeter greeter=new Selam();
        Greeter hello = new Hello();


        //runTarget(greeter);

        runBeforeAdvice(hello);
        System.out.println("********");
        runAfterAdvice(greeter);
        System.out.println("********");
        runAroundAdvice(hello);
    }

    public static void runTarget(Greeter greeter){
        greeter.greet();
    }

    public static void runBeforeAdvice(Greeter target){
        ProxyFactory factory = new ProxyFactory();
        factory.addAdvice(new BeforeAdvice());
        factory.setTarget(target);

        Greeter proxy= (Greeter) factory.getProxy();
        //greet join point
        proxy.greet();
    }

    public static void runAfterAdvice(Greeter target){
        ProxyFactory factory=new ProxyFactory();
        factory.addAdvice(new AfterAdvice());
        factory.setTarget(target);

        Greeter result= (Greeter) factory.getProxy();
        result.greet();
    }

    public static void runAroundAdvice(Greeter target){
        ProxyFactory factory=new ProxyFactory();
        factory.addAdvice(new AroundAdvice());
        factory.setTarget(target);
        Greeter proxy = (Greeter) factory.getProxy();
        proxy.greet();
    }
}
