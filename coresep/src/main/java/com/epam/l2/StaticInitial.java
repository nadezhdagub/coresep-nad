package com.epam.l2;

public class StaticInitial {

    private int get;
    private Cat cat;

    public StaticInitial(int get, Cat cat){
        this.get = get;
        this.cat = cat;
    }
    private static int count = 0;

    static {
        count = 5;
    }

    public String getName(){
        return cat.getName();
    }

    public static void main(String[] args) {
        System.out.println(count);
    }
}
