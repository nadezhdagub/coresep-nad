package com.epam.l5;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        String name = "barsik";

        System.out.println(name.charAt(2));
        System.out.println(name.length());
        System.out.println(name.subSequence(2, 5));

        char[] chars = new char[3];
        name.getChars(2, 4, chars, 0);

        System.out.println(chars);

        String name2 = "";
        String name3 = null;
        String name4 = "bars";

        System.out.println(name2.isEmpty());  //true
        System.out.println(name3.isEmpty());  //eroor
        System.out.println(name4.isEmpty());  //false

        System.out.println(name4.codePointAt(1 ));
        System.out.println(name4.codePointBefore(1 ));

        System.out.println(Arrays.toString(name4.getBytes()));
    }
}
