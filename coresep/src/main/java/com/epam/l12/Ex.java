package com.epam.l12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Barsil");
        list.add("Murzil");

        for (String name : list) {
            if (name.equalsIgnoreCase("barsik")) {
                list.remove("Barsik");
            }
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equalsIgnoreCase("barsik")) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
