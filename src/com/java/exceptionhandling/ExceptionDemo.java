package com.java.exceptionhandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int init = 0;

        // Object ob = null;

        // java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "ob" is null
        // System.out.println(ob.hashCode());

        // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        for (int i = 0; i <= arr.length; i++) {
            arr[i] = ++init;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
