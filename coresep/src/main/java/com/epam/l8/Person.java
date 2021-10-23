package com.epam.l8;

public class Person implements  Comparable<Person>{
    private String firstName;
    private String lastName;
    private int age;

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAge(10);

        Person person2 = new Person();
        person2.setAge(12);

        System.out.println(person1.compareTo(person2));
    }

    @Override
    public int compareTo(Person anotherPerson) {
        int anotherPersonAge = anotherPerson.age;
        return this.age - anotherPersonAge;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
