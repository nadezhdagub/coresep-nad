package com.epam.l15.waitnotify;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex  implements Runnable{
    private  int i = 0;

    public int getValue() {
        return i;
    }

    private synchronized void evenIncrement() {
        i++;
        i++;
    }
    @Override
    public void run() {
        while (true) {
            evenIncrement();
        }
    }

    public static void main(String[] args) {
        ExecutorService executors = Executors.newCachedThreadPool();
        Ex ex = new Ex();
        executors.execute(ex);

        while (true) {
            int val = ex.getValue();

            if (val % 2 != 0) {
                System.out.println(val);
                System.exit(0);
            }
        }
    }
}
