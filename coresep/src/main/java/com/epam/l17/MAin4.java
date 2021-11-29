package com.epam.l17;


import java.time.*;
import java.time.temporal.TemporalAmount;

public class MAin4 {
    public static void main(String[] args) {
        LocalDate yoday = LocalDate.now();
        System.out.println(yoday);

       // LocalDate barsikBirthday = LocalDate.of(1999, 3, 15);
        LocalDate barsikBirthday = LocalDate.of(1999, Month.APRIL, 15);
        barsikBirthday = barsikBirthday.plusYears(2);
        barsikBirthday = barsikBirthday.minusWeeks(2);
        TemporalAmount amount = Period.ofDays(2);
        barsikBirthday = barsikBirthday.plus(amount);

        barsikBirthday = barsikBirthday.withDayOfMonth(2);
        barsikBirthday = barsikBirthday.withDayOfYear(2);
        barsikBirthday = barsikBirthday.withMonth(2);
        barsikBirthday = barsikBirthday.withYear(2);
        barsikBirthday.getMonth();
        barsikBirthday.getMonthValue();
        barsikBirthday.getYear();

        //Period period = barsikBirthday.until();

        barsikBirthday.isLeapYear();
        System.out.println(barsikBirthday);
    }
}
