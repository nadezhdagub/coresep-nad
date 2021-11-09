package com.epam.l16.horses;

public class HorseService {
    public static void main(String[] args) {
        Horse risak = new Horse(20, "Risak", true, true);
        Horse syzaya = new Horse(30, "Syzaya", true, false);

        printSpeed(risak, O -> O.getSpeed());
        printName(risak, O -> O.getName());

        printSpeed(syzaya, U -> U.getSpeed());
        printName(syzaya , HORSE -> HORSE.getName());
    }

    static void printName(Horse horse, GetName getName) {
        System.out.println(getName.get(horse));
    }

    private static void printSpeed(Horse horse, GetSpeed getSpeed) {
        System.out.println(getSpeed.get(horse));
    }
}
