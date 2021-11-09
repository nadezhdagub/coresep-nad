package com.epam.l16.streams;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex {
    public static void main(String[] args) {
        IntStream intStream;
        LongStream longStream;
        DoubleStream doubleStream; //других нет, для других типов только обходные пути  по типу приведения

        Stream.empty().forEach(System.out::println);
        Stream.of(1, 2, 3).forEach(System.out::println); //=
        Arrays.asList(1, 2, 3).stream().forEach(System.out::println);

        String value = Math.random() > 0.8 ? "I am" : null;  //=
        Stream.ofNullable(value).forEach(System.out::println);

        Stream.generate(() -> 10).limit(10).forEach(System.out::println);
        Stream.iterate(2, s -> s*3).limit(5).forEach(System.out::println);
        Stream.concat(Stream.of(1, 2, 3, 4, 5), Stream.of(6, 7, 8, 9, 10)).forEach(System.out::println);

        Stream.Builder<Integer> builder = Stream.<Integer>builder().add(1).add(2);
        for (int i = 0; i < 10; i++) {
            builder.accept(i);
        }
        builder.add(22).add(32).build().forEach(System.out::println);

        Stream.of(2, 65, 35, 45, 3).filter(x -> x>5).forEach(System.out::println);
    }
}
