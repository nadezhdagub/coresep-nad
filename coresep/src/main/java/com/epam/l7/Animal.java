package com.epam.l7;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void seyGav() {
        System.out.println("Gav");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
