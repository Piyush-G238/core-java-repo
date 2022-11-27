package com.java.lambdaExp;

public class LambdaExp1 {
    public static void main(String[] args) {
        MyInterface obj = str -> System.out.println("Hello, " + str);
        obj.sayHello("Piyush Gupta");
    }
}
