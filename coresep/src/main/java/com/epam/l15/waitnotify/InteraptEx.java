package com.epam.l15.waitnotify;

import java.util.concurrent.TimeUnit;

public class InteraptEx {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().isInterrupted());

            for (int i = 0; i< 100000000; i++) {
                System.err.println(i);

                if (Thread.currentThread().isInterrupted()) {
                    System.err.println(Thread.currentThread().isInterrupted());
                    System.err.println("WakeUp!");
                    break;
                }
            }
            System.err.println(Thread.currentThread().isInterrupted());
        });
        System.err.println("start...");

        thread.start();

        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //thread.stop();  /never use
        thread.interrupt();

        System.err.println();
        System.err.println("finish...");
    }
}
