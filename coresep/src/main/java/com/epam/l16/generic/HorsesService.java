package com.epam.l16.generic;

public class HorsesService {
    public static void main(String[] args) {
        Horse risak = new Horse(20, "Risak", true, true);
        Horse syzaya = new Horse(30, "Syzaya", true, false);

        print(risak, O -> O.getSpeed());  //Generic понимает что у нас int
        print(risak, O -> O.getName());  //Generic понимает что у нас  String

        print(syzaya, U -> U.getSpeed());
        print(syzaya , HORSE -> HORSE.getName());
    }

    private static void print (Horse horse, Get get) {
        System.out.println(get.get(horse));
    }
}
