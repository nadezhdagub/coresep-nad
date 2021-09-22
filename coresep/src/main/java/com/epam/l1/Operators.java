package com.epam.l1;

public class Operators {
    public Operators (){

    }
    public Operators (int count){

    }
    //+, +=, -, -=, *, *=, %, %=. ++, --, /, /=
    public static void main(String[] args) {

        int result = 6;
        result -= 2;

        System.out.println(result);

        int result2 = 6;
        result2 = result2 - 2;

        Operators operators = new Operators();

        int param1 = 10;
        int param2 = 10;

        System.out.println(param1++);
        System.out.println(++param2);
        System.out.println(operators.isEven(2));
        System.out.println(operators.isOdd(6));
    }
    private boolean isEven (int param) {
        return param % 2  == 0;
    }

    private boolean isOdd (int param) {
        return param % 2  != 0;
    }
}
