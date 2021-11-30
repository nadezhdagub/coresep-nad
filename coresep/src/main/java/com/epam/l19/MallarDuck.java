package com.epam.l19;

public class MallarDuck extends Duck{
    public MallarDuck() {
        flyable = new FlyWithWings();
    }
    void display() {
        System.out.println("I am mallar duck");
    }
}
