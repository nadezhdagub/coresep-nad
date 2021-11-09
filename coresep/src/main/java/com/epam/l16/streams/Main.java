package com.epam.l16.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.empty();  //пустой стрим строк
        List<String> list = new ArrayList<>();
        list.stream();
        Map<String, String> map = new HashMap<>();
        map.entrySet().stream(); //Stream<Map.Entry<String, String>>
        Arrays.stream(args); //пустой стрим строк
        Stream.of("Barsik", "Murzik", "Snejok");

        String[] arrays = new String[]{"a", "barsik", "b", "snejok"};
        List<String> list1 = Arrays.stream(arrays).filter(s -> s.length() <= 1).collect(Collectors.toList());
        System.out.println(list1);
    }
}
