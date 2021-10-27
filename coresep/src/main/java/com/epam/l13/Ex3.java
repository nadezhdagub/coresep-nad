package com.epam.l13;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex3 {
    public static void main(String[] args) throws IOException {
        byte[] bytesToWrite = {1, 2, 3};
        byte[] bytesToRead = new byte[10];

        String fileName = "src/main/resources/test.txt";
        FileOutputStream outputStream = null;
        FileInputStream inputStream = null;

        outputStream = new FileOutputStream(fileName);
        System.out.println("file is opened for writing");
        outputStream.write(bytesToWrite);
        System.out.println("Wrote: " + bytesToWrite.length);
        outputStream.close();
        System.out.println("finished out");

        inputStream = new FileInputStream(fileName);
        System.out.println("File is opened for reading");
        int bytesAveluable = inputStream.available();
        System.out.println("Ready for reading: " + bytesAveluable + "bytes");
        int count = inputStream.read(bytesToRead, 0, bytesAveluable);
        System.out.println("Read: " + count + " bytes");
        inputStream.close();
        System.out.println("Finished in");
    }
}
