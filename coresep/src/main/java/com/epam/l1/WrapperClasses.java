package com.epam.l1;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {
    Byte aByte;
    Short aShort;
    Integer aInt;
    Long aLong;

    Float aFloat;
    Double aDouble;

    Boolean aBoolean;
    Character character;

    public static void main(String[] args) {
        int a = 5;

        List list = new ArrayList();
        list.add(a);

        System.out.println(Integer.valueOf("5" + 2));
        System.out.println(new WrapperClasses().character);
    }

    private int getSum(int a){
        return 1;
    }

    private int getSumOfAB(int a, int b){
        return a+b;
    }
}
