package com.epam.l16;

import java.util.function.Supplier;

public class SupplierEx {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Functional";
        System.out.println(supplier.get());
    }
}
