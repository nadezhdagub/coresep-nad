package com.epam.l15;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        RunableEx ex = new RunableEx();
        Thread thread = new Thread(ex);
        thread.start();

        ThreadEx threadEx = new ThreadEx();
        threadEx.start();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am anonymus class from another thread " + Thread.currentThread().getName());
            }
        });

        thread1.start();

        //или
        Thread thread2 = new Thread(() -> System.out.println("I am anonymus class from another thread "
                + Thread.currentThread().getName()));

        //или
        new Thread(() -> System.out.println("I am anonymus class from another thread "
                + Thread.currentThread().getName())).start();


    }
}
