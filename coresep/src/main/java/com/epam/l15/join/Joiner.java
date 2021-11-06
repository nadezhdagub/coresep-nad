package com.epam.l15.join;

public class Joiner extends Thread{
    private Sleeper sleeper;


    public Joiner(String name, Sleeper sleeper) {
        super(name);
        this.sleeper = sleeper;
        start();
    }

    @Override
    public void run() {
        try {
            sleeper.join();
        } catch (InterruptedException e) {
            System.out.println(getName() + " join is end");
        }
    }
}
