package com.epam.l19;

public abstract class Duck {
    Flyable flyable;

    void quack() {
        System.out.println("quack");
    }

    void swim() {
        System.out.println("swim");
    }

    public void performFly() {
        flyable.fly();
    }

    abstract void display();
}
