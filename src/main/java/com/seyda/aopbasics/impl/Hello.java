package com.seyda.aopbasics.impl;

import com.seyda.aopbasics.contact.Greeter;

public class Hello implements Greeter {
    @Override
    public void greet() {
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello");
    }
}
