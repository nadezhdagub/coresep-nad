package com.epam.l16.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main3 {
    public static void main(String[] args) {
        final List<Integer> list = new ArrayList<>();
        IntStream.range(0, 100000000 ).parallel().forEach(o -> list.add(o));
        System.out.println(list.size());
    }
}
