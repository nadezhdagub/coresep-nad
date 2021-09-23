package com.epam.l3;

import java.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperatorsIf {
    private static boolean isTrue = true;
    //if
    public static void main(String[] args) {
        // reader let us to read from console
//        String line = null;
//        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            // readLine - read line
//           // reader.readLine();
//            line = reader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        int finalResult = Integer.parseInt(Objects.requireNonNull(line));

        // в такой конструкции если приходит результат, отличный от трех - у нас все равно red
        // 1 -green, 2- yellow, 3-red, и никак иначе
//        if (finalResult == 1){
//            System.out.println("green");
//        }else if (finalResult == 2){
//            System.out.println("yellow");
//        } else {
//            System.out.println("red");
//        }

        // в enum могут добавить еще параметр, поэтому код ниже не сработает, а его может быть много
        // целесообразнее использовать просто 3 if
//        Colours colours = Colours.RED;
//        if (getColourByTime(colours) == Colours.GREEN) {
//            System.out.println("GREEN");
//        } else if (getColourByTime(colours) == Colours.YELLOW) {
//            System.out.println("YELLOW");
//        } else {
//            System.out.println("RED");
//        }

        Colours colours = Colours.RED;
        if (getColourByTime(colours) == Colours.GREEN) {
            System.out.println("GREEN");
        } else if (getColourByTime(colours) == Colours.YELLOW) {
            System.out.println("YELLOW");
        } else if (getColourByTime(colours) == Colours.RED){
            System.out.println("RED");
        } else {
            throw new RuntimeException();
        }

    }

    private static Colours getColourByTime(Colours colours) {
        return colours;
    }
}
