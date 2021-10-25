package com.epam.l12;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<String, String> map= new TreeMap<>();
        map.put("Murzik", "Murzik");
        map.put("Barsik", "Barsik");

        System.out.println(map.lastKey());
    }
}
