package com.epam.l4;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        Dog barsik = new Dog("barsik", 2);
        Dog dog = new Dog("dog", 1);

        Dog[] dogArray = new Dog[2];
        dogArray[0] = barsik;
        dogArray[1] = dog;

        Dog[] dogs = new Dog[]{barsik, dog};

        System.out.println(Arrays.toString(dogs));   //чтобы вывадились не ссылки а нормальные имена, нужно сделать toString в классе Dog

    }
}
