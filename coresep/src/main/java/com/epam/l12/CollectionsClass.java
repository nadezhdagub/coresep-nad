package com.epam.l12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("barsik");
        list.add("murzik");
        Collections.fill(list, "Snegok");
        System.out.println(list);
    }
}
