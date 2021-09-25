package com.epam.l4;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int [][] array = new int[2][];

        array[0] = new int[2];
        array[0][1] = 2;

        array[1] = new int[5];

        System.out.println(Arrays.deepToString(array));
    }
}
