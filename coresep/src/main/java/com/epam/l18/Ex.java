package com.epam.l18;

public class Ex {
    public static void main(String[] args) {
        System.out.println(asByte(7));
        System.out.println(asByte(new Float("7.f")));
    }

    public static <T extends Number> byte asByte (T num) {
        long n = num.longValue();
        if (n >= -120 && n <= 127) {
            return (byte) n;
        } else {
            return 0;
        }
    }

    public static <Type> void method(Type obj) {
        System.out.println(1);
    }

    public static void method(Number obj) {
        System.out.println(1);
    }
    public static void method(Integer obj) {
        System.out.println(1);
    }
}
