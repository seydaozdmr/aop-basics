package com.seyda.aopbasics.impl;

import com.seyda.aopbasics.contact.Greeter;

public class Selam implements Greeter {
    @Override
    public void greet() {
        System.out.println("Selam");
    }
}
