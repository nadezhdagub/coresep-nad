package com.epam.l16.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main5 {
    public static void main(String[] args) {
        //IntStream.of(20, 40, 120, 500, 32, 12).filter(x -> x<100).map(x -> x +5).limit(2).forEach(System.out::println);
        List<String> list = Arrays.asList("Barsik", "murzik");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
        stream.filter(s -> s.length() >2);
        stream.forEach(System.out::println);
    }
}
