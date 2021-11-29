package com.epam.l17;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Java11Main2 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());

        calendar.getTime();
        //calendar.setTimeZone();
        System.out.println(calendar);

        Date date = new Date(2007, 12, 13, 16,40);
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Hong_Kong");
        Locale locale = new Locale("en");
        Calendar calendar1 = new GregorianCalendar(timeZone, locale);

        System.out.println(calendar1.getTime());

        DateFormat dateFormat = new SimpleDateFormat("HH:mm Z");
        String string = dateFormat.format(date);
        System.out.println(string);

    }
}
