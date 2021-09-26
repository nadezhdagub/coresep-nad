package com.epam.l5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String param = reader.readLine();
            if (reader.readLine().equals("1")) {
                new Main4().fromLiteral();
            } else {
                new Main4().fromLiteral2();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void fromLiteral(){
        String name = "barsik";
        System.out.println(name == "barsik");
    }
    private void fromLiteral2(){
        String name = "murzik";
        System.out.println(name == "barsik");

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name.indexOf("r"));

        System.out.println(name.replace("a", ""));
        System.out.println(name.replaceAll("a", ""));

        System.out.println(name.contains("fgdf"));
        System.out.println(name.startsWith("khk"));
        System.out.println(name.endsWith("fg"));
        System.out.println(" a  ss ".trim());
    }
}
