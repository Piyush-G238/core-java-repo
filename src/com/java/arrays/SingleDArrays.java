/*=================================================
 * File : SingleDArrays.java
 * class : com.java.arrays.SingleDArrays
 * description : Program to demonstrate single dimension arrays
 *=================================================
 * s.no     date         user        description
 *  1     15.10.2022    Piyush         created
 * 
 * ================================================*/
package com.java.arrays;

public class SingleDArrays {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        for (int element : arr) {
            System.out.println(element);
        }

        String[] names = { "Mahesh", "Suresh", "Kamal" };
        for (String name : names) {
            System.out.println(name);
        }
    }
}