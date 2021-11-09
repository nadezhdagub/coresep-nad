package com.epam.l16;

import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {
        Function<String, String> function = s -> s.toUpperCase();
        System.out.println(function.apply("Functional int java 8"));

    }
}
