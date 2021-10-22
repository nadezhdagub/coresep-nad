package com.epam.l7;

public class Final {
    private static final int count;

    static {
        count = 10;
    }
    private final int[] array = new int[3];

    {
        array[1] = 3;  //так как final то можем сделать инициализацию только 1 раз
        array[1] = 5;
        array[1] = 4;
        array[1] = 3;
    }
}
