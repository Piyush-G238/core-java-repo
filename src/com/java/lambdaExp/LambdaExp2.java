package com.java.lambdaExp;

public class LambdaExp2 {
    public static void main(String[] args) {
        SumInterface sumInterface = ((a, b) -> a + b);
        int res = sumInterface.sum(10, 11);
        System.out.println("Sum of 10 and 11 is : " + res);
    }
}
