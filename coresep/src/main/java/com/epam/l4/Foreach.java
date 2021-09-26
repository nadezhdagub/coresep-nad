package com.epam.l4;

public class Foreach {
    public static void main(String[] args) {
        Dog barsik = new Dog("barsik", 3);
        Dog murzik = new Dog("murzik", 1);
        Dog pushok = new Dog("pushok", 3);
       // Pig sharik = new Pig("sharik", 7);

        //Dog[] dogs = new Dog[]{barsik,murzik, pushok };
        Animal[] animals = new Animal[]{barsik,murzik, pushok/*, sharik*/};

        for (Animal animal: animals) {  //не может преобразовать собаку к поросенку
            Dog dog = (Dog) animal;
            System.out.println(animal.toString());
        }
    }
}
