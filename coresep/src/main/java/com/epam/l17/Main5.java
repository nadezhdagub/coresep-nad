package com.epam.l17;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main5 {
    public static void main(String[] args) {
//        LocalTime localTime = LocalTime.of(10, 2);
//        long value = localTime.toEpochSecond(LocalDate.now(), ZoneOffset.MIN);
//
//        System.out.println(value);
//        System.out.println(localTime);
//
//        LocalDateTime localDateTime;

        ZonedDateTime zonedDateTime = ZonedDateTime.of(2020, 2, 2,
                2, 2, 2, 2, ZoneId.of("UTC-2"));

        System.out.println(zonedDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        String format = dateTimeFormatter.format(ZonedDateTime.now());
        System.out.println(format);

//        final  Instant now = Instant.now();
//        final Date date = Date.from(now);
//        System.out.println(date.toInstant());
//        System.out.println(now);

//        ZonedDateTime now = ZonedDateTime.now();
//        GregorianCalendar calendar = GregorianCalendar.from(now);
//        System.out.println(calendar.toZonedDateTime());
//        System.out.println(now);

//        LocalDateTime now = LocalDateTime.now();
//        Timestamp timestamp = Timestamp.valueOf(now);
//        System.out.println(now);
//        System.out.println(timestamp.toLocalDateTime());

//        LocalDate now = LocalDate.now();
//        Date date = Date.valueOf(now);
//        System.out.println(now);
//        System.out.println(date.toLocalDate());

        LocalTime now = LocalTime.now();
        Time time = Time.valueOf(now);
        System.out.println(now);
        System.out.println(time.toLocalTime());

    }
}
