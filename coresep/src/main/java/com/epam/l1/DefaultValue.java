package com.epam.l1;

public class DefaultValue {
    // 0
    byte defaultByte;
    // 0
    short defaultShort;
    // 0
    int dInt;
    // 0
    long defaultLong;
    // 0.0
    float defaultFloat;
    //0.0
    double defaultDouble;

    // false
    boolean fBoolean;
    // '\u0000' (null)
    char dChar;

    public static void main(String[] args) {
        System.out.println(new DefaultValue().dInt);
    }
}
