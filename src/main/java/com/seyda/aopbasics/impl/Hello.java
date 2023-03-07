package com.seyda.aopbasics.impl;

import com.seyda.aopbasics.contact.Greeter;

public class Hello implements Greeter {
    @Override
    public void greet() {
        System.out.println("Hello");
    }
}
