package com.epam.l12;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Cat barsil = new Cat("Barsik");
        Cat murzik = new Cat("Murzik");

        Map<Cat, String> map = new HashMap<>();
        map.put(murzik, "Murzik"); // тип делаем так, чтобы попали в одну ячейку
        map.put(barsil, ("Barsik")); // тип делаем так, чтобы попали в одну ячейку

        System.out.println(map.size());
        System.out.println(map.isEmpty());

        Map<Cat, String> map2 = new HashMap<>();
        map2.putAll(map);
        map.clear();

        System.out.println(map.values());
        System.out.println(map.keySet());
    }
}
