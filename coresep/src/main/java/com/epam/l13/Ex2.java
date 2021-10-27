package com.epam.l13;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        byte[] bytes = {1, -1, 0};

        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
        System.out.println(inputStream.read());
        int read = inputStream.read();
        System.out.println(read);

        System.out.println((byte) read);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        outputStream.write(10);
        outputStream.write(11);
        byte[] butes1 = outputStream.toByteArray();
        System.out.println(Arrays.toString(butes1));
    }
}
