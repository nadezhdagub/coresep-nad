package com.epam.l15.java5;

import java.util.concurrent.Callable;

public class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }


    @Override
    public String call() throws Exception {
        return "result from " + Thread.currentThread().getName() + " " + this.getClass().getName() + " " + id;
    }
}
