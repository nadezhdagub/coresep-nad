package com.epam.l10;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationClass {
    public static void main(String[] args) {
        Vector vector = new Vector(4,2);
        Enumeration enumeration = vector.elements();
        System.out.println("elements in vextor");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement() + " ");
        }
    }
}
