package com.epam.l18;

import java.util.ArrayList;
import java.util.List;

public class MainGeneric {
    public static void main(String[] args) {
//        Object obj = "1";
//
//        int num = Integer.parseInt(String.valueOf(obj));
//        System.out.println("In DB I have a cat with id" + num);
//
//        Object ob2 = "2";
//
//        int num2 = Integer.parseInt(String.valueOf(ob2));
//        System.out.println("In DB I have a cat with id" + num2);

        // Please don't add there nothing except int!!!
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        //list.add("Barsik");

//        int num = Integer.parseInt(String.valueOf(list.get(0)));
//        System.out.println("In DB I have a cat with id" + num);
//
//        int num1 = Integer.parseInt(String.valueOf(list.get(1)));
//        System.out.println("In DB I have a cat with id" + num1);

        for (Integer o : list) {
            int num = Integer.parseInt(String.valueOf(o));
            System.out.println("In DB I have a cat with id" + num);
        }
    }
}
