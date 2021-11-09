package com.epam.l16.inter;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {
        Function<String, String> function = s -> s.toUpperCase();
        System.out.println(function.apply("Functions"));

        Function<String, Integer> function1 = s -> s.length();
        System.out.println(function1.apply("Functions interface"));

        BiFunction<String, String, String> function12 = new BiFunction<String, String, String>() {
            @Override
            public String apply(String s, String s2) {
                return s.concat(s2);
            }
        };

        BiFunction<String, String, String> biFunction = (s, s2) -> s.concat(s2);
        System.out.println(biFunction.apply("Function", "java 8"));
    }
}
