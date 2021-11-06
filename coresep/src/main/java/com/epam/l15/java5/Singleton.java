package com.epam.l15.java5;

public class Singleton {
    private static Singleton curInstance = new Singleton();

    public static Singleton getInstance() {
        return curInstance;
    }

    private Singleton() {

    }
}
