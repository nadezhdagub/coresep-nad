package com.epam.l12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Barsil");
        list.add("Murzil");
        list.add("Barsil");
        list.add("Murzil");
        list.add("Barsil");
        list.add("Murzil");

        System.out.println(list.get(1));
        list.set(3, "Snejok");
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2 .add(2);

        System.out.println(list.get(1));
        System.out.println(list.indexOf("Barsik"));
        System.out.println(list.lastIndexOf("Barsik"));
        list.listIterator();

        List<String> list3 = list.subList(3, 5);
        System.out.println(list3);

        ArrayList list4 = new ArrayList();
        list4.ensureCapacity(55);
        list4.trimToSize();

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Barsik");
        linkedList.add("Murzik");

        linkedList.addFirst("snej");
        linkedList.addLast("snej");
        linkedList.removeFirst();
        linkedList.removeLast();
    }
}
