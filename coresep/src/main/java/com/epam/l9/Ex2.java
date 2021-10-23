package com.epam.l9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {

    public static void main(String[] args) {
        try {
            // open cinnection
            throw new RuntimeException();
        } catch (RuntimeException e) {
            // close connection
        }finally {
            //close connection
            System.out.println("connection close");
        }

        try {
            System.out.println("connection open");
        } finally {
            System.out.println("connection close");
        }


       /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        // выше try эквивалентно нижнему
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
