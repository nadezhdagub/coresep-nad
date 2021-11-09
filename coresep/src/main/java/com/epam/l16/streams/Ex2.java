package com.epam.l16.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.stream().map(o -> o +1).mapToLong(o -> o).forEach(System.out::println);

        System.out.println(Stream.of(1, 2, 3).noneMatch(o -> o==4));
        System.out.println(Stream.of(1, 2, 3).allMatch(o -> o==4));
        System.out.println(Stream.of(1, 2, 3).anyMatch(o -> o==3));

        System.out.println(IntStream.of(1, 2, 3).average());
        System.out.println(IntStream.of(1, 2, 3).sum());
    }
}
