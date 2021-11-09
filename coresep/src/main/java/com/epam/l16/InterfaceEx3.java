package com.epam.l16;

@FunctionalInterface
public interface InterfaceEx3 extends FunctionalInterfaceExample{
    static void getInfo() {

    }

    default void getMoney() {
        System.out.println("Who am I");
    }
}
