package com.epam.l7;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Snejok snejok1 = new Snejok("snejok");
        Snejok snej = new Snejok("snej");

        System.out.println(snej.hashCode());
        System.out.println(snejok1.hashCode());

        System.out.println(snej.equals(snejok1));

        System.out.println((long)Integer.MAX_VALUE-Integer.MIN_VALUE);
        System.out.println(new Main().getClass());

        Cat cat = new Cat();
        Object barsik = cat.clone();
        System.out.println(barsik);

    }
}
