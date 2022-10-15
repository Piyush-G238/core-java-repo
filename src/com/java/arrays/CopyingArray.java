/*=================================================
 * File : CopyingArray.java
 * class : com.java.arrays.CopyingArrays
 * description : Program to demonstrate copying and cloning of arrays 
 *=================================================
 * s.no     date         user        description
 *  1     15.10.2022    Piyush         created
 * 
 * ================================================*/
package com.java.arrays;

public class CopyingArray {
    public static void main(String[] args) {
        char[] copyfrom = {'a','b','c','d','e','f','g'};

        char[] copyto = new char[5];

        System.arraycopy(copyfrom, 2, copyto, 0, 5);

        for (char c : copyto) {
            System.out.print(c+" ");
        }

        System.out.println();
        
        char[] cloningFrom = {'a','e','i','o','u'};

        char[] cloningto = cloningFrom.clone();

        for (char c : cloningto) {
            System.out.print(c+" ");
        }
    }
}
