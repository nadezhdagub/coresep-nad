package com.epam.l1;

public class Logic {
    //default = false
    private boolean paramA = true;
    private boolean paramB = false;
    private boolean paramC = true;

    public static void main(String[] args) {
        Logic logic = new Logic();
        System.out.println(logic. checkResultFirst(logic.paramA, logic.paramB, logic.paramC));
        System.out.println(logic. checkResult2(logic.paramA, logic.paramB, logic.paramC));
        System.out.println(logic. checkResult3(logic.paramA, logic.paramB, logic.paramC));
        System.out.println(logic. checkResult4(logic.paramA, logic.paramB, logic.paramC));
    }
    // &&, ||, >, <, ==, !=, >=, <=

    // A && B || C
    private boolean checkResultFirst(boolean a, boolean b, boolean c) {
        return a && b || c;
    }
    private boolean checkResult2(boolean a, boolean b, boolean c) {
        return a && b;
    }
    private boolean checkResult3(boolean a, boolean b, boolean c) {
        return c || b;
    }
    private boolean checkResult4(boolean a, boolean b, boolean c) {
        return a ||  b && c;
    }
}
