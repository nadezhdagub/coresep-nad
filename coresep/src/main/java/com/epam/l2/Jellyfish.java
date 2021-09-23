package com.epam.l2;

public class Jellyfish extends Animal{
    @Override
    public void eat(){
        System.out.println("Its body is its mouth");
    }

    public static void main(String[] args) {
        Animal animal = new Jellyfish();
        animal.eat();
    }
}
