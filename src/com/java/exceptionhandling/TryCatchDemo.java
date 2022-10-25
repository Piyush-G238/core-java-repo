package com.java.exceptionhandling;

public class TryCatchDemo {
    public static void main(String[] args) {
        int[] arr = { 25, 87, 69, 4, 35, 11, 1 };
        int b = 49;
        try {
            System.out.println("Inside try block...");
            b /= 0;
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
            System.out.println(b);
        } catch (ArrayIndexOutOfBoundsException ae) {
            ae.printStackTrace();
        }
        catch (ArithmeticException ae) {
            System.out.println("Inside exception block...");
            ae.printStackTrace();
        }
        finally{
            System.out.println("Inside finally block...");
        }
    }
}
