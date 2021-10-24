package com.epam.l11;

import java.util.HashSet;
import java.util.Set;

public class Ex {
    public static void main(String[] args) {
        Set<Cat> set = new HashSet<>();
        Cat barsik = new Cat("barsik");
        Cat murzik = new Cat("murzik");
        set.add(barsik);
        set.add(murzik);
        System.out.println(set);
        System.out.println(set.contains(barsik));

    }
}
