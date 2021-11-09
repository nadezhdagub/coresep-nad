package com.epam.l16.consumerpac;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicatesEx {
    public static void main(String[] args) {
        Predicate<String> predicate = O -> O.isEmpty();
        System.out.println("");

        BiPredicate<String, String> biPredicate = ((s, s2) -> s.equals(s2));
        System.out.println("Functoonal java");
    }
}
