package com.epam.l15;

public class RunableEx implements Runnable{
    @Override
    public void run() {
        System.out.println("I am from thread " + Thread.currentThread().getName());
    }
}
