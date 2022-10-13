package com.java.fundamentals;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean result = true && true;
        boolean result1 = true && false;
        System.out.println(result);
        System.out.println(result1);

        boolean orResult = true;
        orResult = orResult || false;
        boolean inverted = !true;

        System.out.println(orResult);
        System.out.println(inverted);
    }
}
