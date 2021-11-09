package com.epam.l16;

public class RealFunc implements FunkEx1{
    @Override
    public void getInfo(String name) {
        name = name.toUpperCase();
        System.out.println("I am realisation");
        System.out.println("I am class");
    }
}
