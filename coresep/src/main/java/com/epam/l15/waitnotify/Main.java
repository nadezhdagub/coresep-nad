package com.epam.l15.waitnotify;

import java.util.concurrent.TimeUnit;

public class Main {
    private static final Object key = new Object();

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i=0; i < 10; i++) {
                System.out.println(i);

                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //notify
            synchronized (key) {
                key.notify();
            }
        });

        System.out.println("start...");
        thread.start();

        //wait
        synchronized (key) {
            try {
                key.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("finish...");
    }


}
