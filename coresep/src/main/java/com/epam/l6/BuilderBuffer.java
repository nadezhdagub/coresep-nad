package com.epam.l6;

public class BuilderBuffer {
    public static void main(String[] args) {
        StringBuilder builder;
        StringBuffer buffer;

        String name = "Va" + "Si" + "Li" + "Sk";

        builder = new StringBuilder ("barsik");
        System.out.println(builder.length());
        System.out.println(builder.charAt(2));

        builder.setCharAt(2, 'R');
        System.out.println(builder);

        System.out.println(builder.subSequence(2, 4));

        builder.append(" the").append(" cat");
        System.out.println(builder);

        builder.insert(11, "good");
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);
    }
    private String getInfo() {
        return String.valueOf(new StringBuilder("ba").append("asd"));
       // return "ba" + "asd";
    }

    private void createPackege() {

    }
}
