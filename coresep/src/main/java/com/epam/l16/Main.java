package com.epam.l16;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        System.out.println(cat.getInfo("barsik"));

       // Animal animal = new Animal();    // так не можем получить экземпляр интерфейса
        // поскольку он является абстрактным классом, а в абстрактном классе мы тоже этого сделать не можем

        Animal animal = new Animal() {
            @Override
            public String getInfo(String name) {
                return "I am animal with name " + name;
            }
        };

        Animal animal1 = name -> "I am animal with name " + name;
        System.out.println(animal.getInfo("Bags"));
        System.out.println(animal1.getInfo("Rojet"));

        FunkEx1 funkEx1 = new RealFunc();
        funkEx1.getInfo("barsik");

        FunkEx1 funkEx11 = new FunkEx1() {
            @Override
            public void getInfo(String name) {
                System.out.println("I am new realization" + name);
            }
        };
        funkEx11.getInfo("barsik");

        FunkEx1 funkEx12 = name -> {
            name = name.toUpperCase();
            System.out.println("I am realisation");
        };
        funkEx12.getInfo("barsik");
    }
}
