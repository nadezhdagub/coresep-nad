package com.epam.l15;

public class ThreadEx extends Thread{

    @Override
    public void run() {
        System.out.println("I am from another thread " + Thread.currentThread().getName());
    }
}
