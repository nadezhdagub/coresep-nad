package com.epam.l17;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(1);
        System.out.println(date.getTime());

        Date date2 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
    }
}
