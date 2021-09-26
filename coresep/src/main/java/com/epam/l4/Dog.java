package com.epam.l4;

public class Dog extends Animal{
    private String name;
    private int age;

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
    /*    return "Dog{" +
                "name='" + name + '\'' +
                '}';*/
        return super.getName();
    }
}
