package com.epam.l4;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int i = 5;
        int i2 = 6;
        int i3 = 7;
        int[] array = new int[5];
        array = new int[10]; //пересоздание массива, то есть вместо 3х значений, будет 10
        array[0] = i;
        array[1] = i2;
        array[2] = i3;

        System.out.println(array); //выводит ссылки
        System.out.println(Arrays.toString(array));

//        int[] arr = new int[]{5, 11, 2, 6};
//
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr.length);
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().freeMemory());
    }
}
