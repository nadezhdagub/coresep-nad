package com.epam.l7;

import java.util.Objects;

public class Barsik {
    private int age;
    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Barsik barsik = (Barsik) o;
        return Objects.equals(name, barsik.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Barsik{" +
                "age" + age +
                ", name='" +name + '\'' +
                '}';
    }
}
