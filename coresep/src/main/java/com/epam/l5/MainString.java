package com.epam.l5;

import java.io.UnsupportedEncodingException;

public class MainString {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "this is a string";
        String s1 = "";
        String s2 = null;
        s = "asasas"; // уже новый объект

        char[] charArray = s.toCharArray();
        String ss = new String(charArray, 2, 3); //выводит значение по принципу: откуда, с какого элемента, сколько элементов
        System.out.println(ss);

        byte[] ascii = {65, 66, 67, 68, 69, 70};
        System.out.println(new String(ascii));

        byte[] data = {(byte) 0xE3, (byte) 0xEE};
        System.out.println(new String(data, "CP1251"));
    }
}
