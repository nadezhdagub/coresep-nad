package com.epam.l10;

import java.util.BitSet;

public class BITset {
    public static void main(String[] args) {
        BitSet bitset = new BitSet();
        bitset.set(0);
        bitset.set(1);
        System.out.println(bitset);
        bitset.clear(0);
        System.out.println(bitset);
        System.out.println(bitset.length());
        System.out.println(bitset.size());

        bitset.set(2);
        bitset.set(4);
        System.out.println(bitset);
        System.out.println(bitset.length());
        System.out.println(bitset.size());
    }
}