package com.epam.l5;

public class Main3 {
    public static void main(String[] args) {
        String ex = "barsik";
        String ex3 = "barsik";
        String ex2 = "bar" + "sik";
        String ex4 = new String("barsik").intern();

      //  System.out.println(ex.concat(ex2));

        System.out.println(ex == "barsik"); //
        System.out.println(ex == ex3);
        System.out.println(ex == ex2);
        System.out.println(ex == ex4);

    }
}
