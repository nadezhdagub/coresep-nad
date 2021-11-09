package com.epam.l16;

public class Cat implements Animal{
    @Override
    public String getInfo(String name) {
        return "I am cat with name: " + name;
    }
}
