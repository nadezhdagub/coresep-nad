package com.epam.l15;

import java.io.IOException;

public class MainVolatile {
    private static volatile boolean flag = true;

    public static void main(String[] args) {
        new ThreadFlagReader().start();
        new ThreadFlagSetter().start();
    }

    public static class ThreadFlagReader extends Thread {
        @Override
        public void run() {
            System.out.println("waiting...");

            while (flag) {

            }

            System.out.println("Gogogo");
        }
    }

    public static class ThreadFlagSetter extends Thread {
        @Override
        public void run() {
            try {
                int k = System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }

            flag = false;

            System.out.println("flag is down");
        }
    }
}
