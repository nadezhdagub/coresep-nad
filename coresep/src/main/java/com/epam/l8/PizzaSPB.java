package com.epam.l8;

public class PizzaSPB implements Pizza{

    @Override
    public void wash() {
        System.out.println("I am washing hands");
    }

    @Override
    public void cook() {
        System.out.println("cooking with cheese");
    }

    @Override
    public void delivery() {
        System.out.println("sending pizza to clients");
    }

    @Override
    public void pay() {
        System.out.println("I am paing");

    }

    @Override
    public void check() {

    }
}
