package com.epam.l2;

public class Initial {
    private int count = 0;

    {
        count = 10;
    }

    public Initial(int count){
        this.count = count;
    }
    public static void main(String[] args) {
        Initial in = new Initial(5);
        System.out.println(in.count);
    }
}
