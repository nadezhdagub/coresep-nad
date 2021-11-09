package com.epam.l16.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 43, 2, 15, 21);
        //list.parallelStream().filter(x -> x> 15).map(x -> x*3).collect(Collectors.toList());
        System.out.println(list.parallelStream().filter(x -> x> 15).map(x -> x*3).collect(Collectors.toList()));

        IntStream.range(0, 100).parallel().map(x -> x+2).sum();
    }
}
