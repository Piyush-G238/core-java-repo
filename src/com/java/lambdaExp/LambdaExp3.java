package com.java.lambdaExp;

public class LambdaExp3 {
    public static void main(String[] args) {
        Runnable thread1 = ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Current value of i is : "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t = new Thread(thread1);
        t.start();
    }
}
