package com.epam.l12;

@FunctionalInterface
public interface CatInter {
    static void getName() {
        System.out.println("I am  B");
    }

    static void getName2() {
        System.out.println("I am  M");
    }

    abstract String getInfo(String name);
}
