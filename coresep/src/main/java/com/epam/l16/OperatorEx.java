package com.epam.l16;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorEx {
    public static void main(String[] args) {
        UnaryOperator<StringBuilder> unaryOperator = sb -> sb.reverse();
        System.out.println(unaryOperator.apply(new StringBuilder("Functoonal java")));

        BinaryOperator<StringBuilder> binaryOperator = ((sb, sb2) -> sb.append(sb2));
        System.out.println(binaryOperator.apply(new StringBuilder("Functoonal"), new StringBuilder("java")));

    }
}
