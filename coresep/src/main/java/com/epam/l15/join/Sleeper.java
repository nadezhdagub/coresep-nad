package com.epam.l15.join;

public class Sleeper extends Thread{
    private int duration;

    public Sleeper(String name, int sleepTime) {
        super(name);
        this.duration = duration;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(getName() + " interapted " + interrupted());
            return;
        }

        System.out.println(getName() + " activated");
    }
}
