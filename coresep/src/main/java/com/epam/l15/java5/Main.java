package com.epam.l15.java5;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    //Executor
    public static void main(String[] args) {
//        ExecutorService executor = Executors.newFixedThreadPool(5);
//
//        for (int i = 0; i < 20; i++) {
//            executor.execute(() -> {
//                System.out.println(Thread.currentThread().getName());
//                Random random = new Random();
//                int count = random.nextInt(5);
//                try {
//                    TimeUnit.SECONDS.sleep(count);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//        }
//        executor.shutdown();

//        ExecutorService executor = Executors.newSingleThreadExecutor();
//        for (int i = 0; i < 5; i++) {
//            executor.execute(() -> {
//                try {
//                    TimeUnit.SECONDS.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName());
//            });
//        }

        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 00; i++) {
            executor.execute(() -> System.out.println("Hello " + Thread.currentThread().getName()));
        }

    }
}
