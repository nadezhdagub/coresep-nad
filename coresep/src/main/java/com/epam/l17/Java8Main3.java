package com.epam.l17;

import java.time.Duration;
import java.time.Instant;

public class Java8Main3 {
    public static void main(String[] args) {
        Instant start = Instant.now();

        System.out.println("some logic");
        for (int i = 0; i < 1000000; i++) {
            int j = i % 10;
        }
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println(timeElapsed.toMillis());
    }
}
