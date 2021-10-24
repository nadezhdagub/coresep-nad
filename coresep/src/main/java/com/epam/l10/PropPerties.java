package com.epam.l10;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropPerties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.getProperty("asd");
        properties.setProperty("asd", "value");


        Properties capital = new Properties();
        Set states;
        String str;
        capital.put("Illinois", "Spring");
        capital.put("Washington", "Olympia");

        states = capital.keySet();
        Iterator it = states.iterator();
        while (it.hasNext()) {
            str = (String) it.next();
            System.out.println("the capital of " + str + " is capitals" + capital.getProperty(str) + ".");
        }
        System.out.println();
        str = capital.getProperty("Florida", "Not found");
        System.out.println(str);
    }
}
