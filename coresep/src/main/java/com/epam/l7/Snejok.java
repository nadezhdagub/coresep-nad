package com.epam.l7;

import java.util.Objects;

public class Snejok {
    private String name;

    @Override
    public String toString() {
        return "Snejok{" +
                "name='" +name + '\'' +
                '}';
    }

    public Snejok(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snejok snejok = (Snejok) o;
        return Objects.equals(name, snejok.name);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
