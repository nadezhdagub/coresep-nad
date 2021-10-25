package com.epam.l12;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Barsik", "Barsik the cat");
        map.get("Barsik");
        map.remove("Barsik");

        System.out.println(map.containsKey("Barsik"));
        System.out.println(map.size());

        for (String val : map.keySet()) {
            if(val == null) {
                System.out.println(map.get(null));
            }
        }
    }
}
