package com.epam.l9;

public class Main {

    public static void main(String[] args) {
        new Main().getFood("Barsik");
        new Main().getFood("Murzik");
        new Main().getFood("Snejok");
    }

    void getFood(String name) {
        if (name.equals("Barsik")) {
            System.out.println("i am eating");
        } else if (name.equals("Murzik")) {
            System.out.println("Murzik waiting 8 p.m.");
        } else {
            throw new IllegalArgumentException("Access to food restricted to: " + name);
        }

        System.out.println("food grated to: " + name);
    }
}
