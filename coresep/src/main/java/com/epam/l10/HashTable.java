package com.epam.l10;

import java.util.*;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("1", "One");
        hashtable.put("2", "Two");
        hashtable.put("3", "Three");

        Collection c = hashtable.values();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        c.remove("One");

        Enumeration e = hashtable.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

/*        Vector vector = new Vector(4,2);
        Enumeration enumeration = vector.elements();

        Hashtable<String, String> map = new Hashtable<>();
        for (Enumeration<String> e = map.keys(); e.hasMoreElements();) {
            String s = e.nextElement();
            System.out.println(s);
        }*/
    }

}
