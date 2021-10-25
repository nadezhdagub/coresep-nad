package com.epam.l12;

import java.util.Objects;

public class Cat {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public Cat(String name) {
        this.name = name;
    }
}
