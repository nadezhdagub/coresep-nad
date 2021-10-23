package com.epam.l9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello!");
        //throw new RuntimeException("1-exception");

        try {
            throw new RuntimeException("1-exception");
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("By");
    }

    void getMoney() throws IOException {
        throw new IOException();
    }

    void getMoney2() throws RuntimeException {
        throw new RuntimeException();
    }

    void getInfo() {
        try {
            getMoney();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
