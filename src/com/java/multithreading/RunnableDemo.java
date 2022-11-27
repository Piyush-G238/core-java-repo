package com.java.multithreading;

class DEF implements Runnable {
    Thread t;

    public DEF(String name) {
        this.t = new Thread(this, name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(t.getName() + "  " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class RunnableDemo {
    public static void main(String[] args) throws InterruptedException {
        DEF thread1 = new DEF("Thread 1");
        DEF thread2 = new DEF("Thread 2");
        DEF thread3 = new DEF("Thread 3");

        thread1.t.start();
        thread2.t.start();
        thread3.t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread : " + "  " + i);
            Thread.sleep(1000);
        }
    }
}
