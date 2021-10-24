package com.epam.l11;

import java.util.HashSet;
import java.util.Set;
import com.epam.l11.Cat;

public class Ct {
    public static void main(String[] args) {
        Set<Cat> set = new HashSet<>();
        Cat barsik = new Cat("Barsik");
        Cat murzik = new Cat("Murzik");
        Cat murzik1 = new Cat("Murzik1");
        Cat murzik2 = new Cat("Murzik2");
        Cat murzik3 = new Cat("Murzik3");
        Cat murzik4 = new Cat("Murzik4");
        Cat murzik5 = new Cat("Murzik5");
        Cat murzik6 = new Cat("Murzik6");
        Cat murzik7= new Cat("Murzik7");
        Cat murzik8 = new Cat("Murzik8");

        set.add(barsik);
        set.add(murzik);
        set.add(murzik1);
        set.add(murzik2);
        set.add(murzik3);
        set.add(murzik5);
        set.add(murzik4);
        set.add(murzik6);
        set.add(murzik7);
        set.add(murzik8);


        System.out.println(set);

        Cat barsik2 = new Cat("Barsik");
        set.add(barsik2);

        System.out.println(barsik.equals(barsik2));
        System.out.println(barsik.hashCode());
        System.out.println(barsik2.hashCode());

        System.out.println(set);
    }
}
