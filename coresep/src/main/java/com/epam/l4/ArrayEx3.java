package com.epam.l4;

import java.util.Arrays;

public class ArrayEx3 {
    public final int comeField = 5;

    public static void main(String[] args) {
        int[][] array = new int[4][3];
        int count = 4;

        for (int i = 0; i<4; i++) {
            for (int j = 0; j<3; j++) {
                array[i][j] = ++count;
            }
        }
        System.out.println(Arrays.deepToString(array));


    }
}
