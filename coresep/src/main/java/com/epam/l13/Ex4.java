package com.epam.l13;

import java.io.*;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        String tmp = "dfgsdfgsdfgaegagaadfasdf";

        int lenght =tmp.length();
        char[] chars = new char[lenght];

        tmp.getChars(0, lenght, chars, 0);
        CharArrayReader input1 = new CharArrayReader(chars);
        CharArrayReader input2 = new CharArrayReader(chars, 0, 5);

        int i;
        System.out.println("Input1 is: ");
        while ((i = input1.read()) !=-1) {
            System.out.println((char) i);
        }

        System.out.println();
        System.out.println("Input2 is: ");
        while ((i = input2.read()) !=-1) {
            System.out.println((char) i);
        }

        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("outfiles0"), "UTF8"));
        out.write("sdsd");
        out.close();
    }
}
