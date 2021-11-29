package com.epam.l17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Java10Main {
    public static void main(String[] args) {
//        Date date = new Date();
//        date.setTime(1);
//        System.out.println(date.getTime());
//
//        Date date2 = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("31-05-1985 10:20:56");

        SimpleDateFormat sdf = new SimpleDateFormat("dd-N-yyyy hh:mm:ss");
        String dateInString = "31-05-1985 10:20:56";
        Date date3 = null;

        try {
            date3 = sdf.parse(dateInString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(date3);
    }
}
