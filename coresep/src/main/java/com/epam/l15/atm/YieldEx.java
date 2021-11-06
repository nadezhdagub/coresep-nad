package com.epam.l15.atm;

public class YieldEx {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 20; j++) {
                        System.out.println(Thread.currentThread().getName() + " " + j);
                        Thread.yield();
                    }
                }
            }).start();
        }
    }
}
