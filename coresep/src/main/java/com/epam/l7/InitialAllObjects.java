package com.epam.l7;

public class InitialAllObjects {
    private static int count = 10;
    static {
        count = 15;
    }
    static {
        count = 19;
    }

    public static void main(String[] args) {
        System.out.println(count);
    }
}
