package com.epam.l7;

public class Main2 {
    public static void main(String[] args) {
        Barsik barsik = new Barsik();
        barsik.setName("Barsik");

        System.out.println(barsik.hashCode());
        System.out.println(barsik.getClass().getName());
        System.out.println(Integer.toHexString(barsik.hashCode()));
        System.out.println(barsik);
    }
}
