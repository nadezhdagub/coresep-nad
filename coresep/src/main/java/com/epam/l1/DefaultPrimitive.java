package com.epam.l1;

public class DefaultPrimitive {
    public static void main(String[] args) {
        System.out.println(getSum((byte)1, (byte)1));
    }

    private static byte getSum (byte v1, byte v2){
        v1 = 120;
        v2 = 120;
        return (byte) (v1 + v2);     //если какая-то операция, которая ниже int, то результирующее значение приводится к инт
    }

    private static long getIntSum (int i1, long i2){
        return i1 + i2;
    }

    private static double getS (float v1, double v2){
        double someValue = v1;
        float f1 = (float) v2;
        return v1 + v2;
    }

}
