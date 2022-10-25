package com.java.exceptionhandling;

public class ThrowDemo {
    public static void addNumbers(int a, int b) throws ArithmeticException {
        if (b <= 0 || a <= 0)
            System.out.println("exception caught");
        int res = a / b;
        System.out.println(res);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            addNumbers(a, b);
            // if (b <= 0 || a <= 0) {
            // throw new ArithmeticException();
            // }
            // int res = a / b;
            // System.out.println("The result of expression is : " + res);
        } catch (Exception e) {
            System.out.println("Cannot divide a number from zero");
            e.printStackTrace();
        }
    }
}
