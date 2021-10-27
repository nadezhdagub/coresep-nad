package com.epam.l13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class InOut {
    public static void main(String[] args) {
        PrintWriter printWriter = null;
/*            try {
                FileWriter out = new FileWriter("text.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(out);

                printWriter = new PrintWriter(bufferedWriter);

                printWriter.println("I am a sentence in a text file");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (printWriter != null) {
                    printWriter.close();
                }
            }*/

            try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("text.txt")))) {
                writer.println("I am a sentence in a text file");
            } catch (IOException e) {
                e.printStackTrace();
            }
    }


}
