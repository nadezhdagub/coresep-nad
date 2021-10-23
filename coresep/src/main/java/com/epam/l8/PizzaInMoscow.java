package com.epam.l8;

public class PizzaInMoscow implements Pizza{

    @Override
    public void wash() {
        System.out.println("I am washing hands");
    }

    @Override
    public void cook() {
        System.out.println("cooking");
    }

    @Override
    public void delivery() {
        System.out.println("sending pizza to clients");
    }

    @Override
    public void pay() {
        System.out.println("I am paing free");
    }

    @Override
    public void check() {

    }
}
