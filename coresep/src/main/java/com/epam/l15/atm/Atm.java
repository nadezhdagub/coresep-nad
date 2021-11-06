package com.epam.l15.atm;

public class Atm {

    static int money = 100;

    static synchronized void getMoney(int amount) { //toilet
        if (amount<= money) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money-=amount;
            System.err.println("All ok. New amount: " + money);
        } else {
            System.err.println("Not enough money");
        }
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Mike");
                getMoney(50);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Jack");
                getMoney(50);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("vorobey");
                getMoney(50);
            }
        }).start();
    }
}
