package com.java.multithreading;

class ABC extends Thread {
    public ABC(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "  " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadClassDemo {
    public static void main(String[] args) {
        ABC th1 = new ABC("Thread 1");
        ABC th2 = new ABC("Thread 2");
        ABC th3 = new ABC("Thread 3");
        th1.start();
        th2.start();
        th3.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread" + "  " + i);
        }
    }
}