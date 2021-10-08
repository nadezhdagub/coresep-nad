package com.epam.l6;

import java.util.Date;

public class Main2 {
    Date date;
    java.sql.Date date2;

    int count = 2_0_00_000;

    public static void main(String[] args) {
        Main2 main2 = new Main2();
        System.out.println(main2.count);
        short param1 = 2;
        short param2 = 2;

        getSum (param1 + param2, 2);
    }

    private static int getSum(int a, int b) {
        Main2 main2 = new Main2();
        main2.date = new Date(); 
        return a + b;
    }

    private static double getSum(double a, int b) {
        return a + b + 1.0;
    }
}
