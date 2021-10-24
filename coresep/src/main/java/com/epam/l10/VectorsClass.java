package com.epam.l10;

import java.util.Vector;

public class VectorsClass {
    public static void main(String[] args) {
        Vector vector = new Vector(4,2);
        System.out.println("Initial size" + vector.size());
        vector.addElement(new Integer(2));
        vector.addElement(new Integer(3));
        vector.addElement(new Integer(4));
        vector.addElement(new Integer(5));
        System.out.println("Initial size" + vector.capacity());
        vector.addElement(new Integer(1));
        System.out.println("Initial size" + vector.capacity());
        System.out.println("Initial size" + vector.size());
        vector.addElement(new Double(1.2));
    }
}
