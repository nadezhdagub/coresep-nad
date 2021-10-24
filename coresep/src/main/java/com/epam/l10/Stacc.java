package com.epam.l10;

import java.util.Stack;
import java.util.StringTokenizer;

public class Stacc {
    public static void main(String[] args) {
        System.out.println(checkParity("a-(b-(c-a) / (b+c) -2()", "(", ")"));
    }

    private static boolean checkParity(String expression, String open, String close) {
        Stack stack= new Stack();
        StringTokenizer st = new StringTokenizer(expression, "\t\n\r+*/-(){}", true);
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            if (temp.equals(open)) {
                stack.push(open);
            }
            if (temp.equals(close)) {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else return false;
    }
}
