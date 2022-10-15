/*=================================================
 * File : MultiDArrays.java
 * class : com.java.arrays.MultiDArrays
 * description : Program to demonstrate multidimensional arrays
 *=================================================
 * s.no     date         user        description
 *  1     15.10.2022    Piyush         created
 * 
 * ================================================*/

package com.java.arrays;

public class MultiDArrays {
    public static void main(String[] args) {
        // Example of matrix
        int[][] matrix3x3 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(matrix3x3[0][0]);

        // using for loop
        for (int i = 0; i < matrix3x3.length; i++) {
            for (int j = 0; j < matrix3x3[i].length; j++) {
                System.out.print(matrix3x3[i][j] + " ");
            }
            System.out.println();
        }

        //using for each loop
        for (int[] row : matrix3x3) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        // Example of Jagged Array
        int[][] multiArray = {
                { 1, 2 },
                { 2, 3, 4 },
                { 5 },
                { 6, 7, 8, 9 }
        };

        // using for each loop
        for (int[] arr : multiArray) {
            for (int data : arr) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
    }
}
