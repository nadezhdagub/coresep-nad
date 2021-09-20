package com.epam.l1;

public class Main {
    //psvm
    public static void main(String[] args){
        // sout
        //System.out.println("Hello world");

        double v1 = 2.0;
        float f1 = 2.0F;
        float f2 = (float) v1;
        double v2 = f2;

        System.out.println(f2);

        System.out.println(f1 == f2);
        System.out.println(v1 == v2);
    }
}
