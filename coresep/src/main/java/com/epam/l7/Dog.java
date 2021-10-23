package com.epam.l7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dog extends Animal{
    public Dog(String name) {
        super(name + "2");
        this.seyGav();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Sharik");
        dog.seyGav();
        Animal dog2 = new Dog("Sharik");   //сужаемся
        Tuzik tizik = new Tuzik("asf");
        System.out.println(dog instanceof Animal);
        String animalParam = null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            animalParam = reader.readLine();
        }catch (IOException e) {
            e.getStackTrace();
        }
        Animal animal = dog.getAnimalInstance(animalParam);
        System.out.println(animal instanceof Tuzik);
        Dog dogA = (Dog) new Animal("asd");//расширяемся
        Animal dog3 = new Animal("Sharik");
        System.out.println(dog.getName());
        System.out.println(dog2.getName());
        System.out.println(dog3.getName());
    }

    private Animal getAnimalInstance(String animalParam) {
        if (animalParam.equals("1")) {
            return new Tuzik("asf");
        } else {
            return new Dog ("asd");
        }
    }

    public void seyGav() {
        System.out.println("Gav");
    }
}
