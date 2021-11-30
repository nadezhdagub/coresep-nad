package com.epam.l18;

public class Main3 {
    public static void main(String[] args) {
        OptionalQ<Double> md = new OptionalQ<>(71.4D);
        System.out.println(md.someAny(md));

        OptionalQ<Integer> mi = new OptionalQ<>(71);
        System.out.println(md.someAny(mi));
        // md.same(mi);
        System.out.println(md.roundMark());

    }
}
