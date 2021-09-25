package com.epam.l4;

public class Main {
    public static void main(String[] args) {
        int i=0;

        while (true){
            i++;

            if (i == 50){
                continue;
            }
            System.out.println("current i is " + i);

            if (i == 100) {
                break;
            }
        }
    }
}
