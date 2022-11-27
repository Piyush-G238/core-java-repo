package com.java.lambdaExp;

@FunctionalInterface
interface Int1 {
    void demo();
}

public class LambdaExp0 {
    Int1 obj = ()->{
        System.out.println("Hello world");
    };
    public static void main(String[] args) {
        LambdaExp0 oExp0 = new LambdaExp0();
        oExp0.obj.demo();
    }
}
