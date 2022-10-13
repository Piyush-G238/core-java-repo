package com.java.fundamentals;

public class ShiftOperators {
    public static void main(String[] args) {
        int integerNum = 5;

        int leftShift = integerNum << 1; // shifting each bit by 1 on left side

        System.out.println(leftShift);

        leftShift <<= 1; // again shifting each bit by 1 on left side

        System.out.println(leftShift);

        int rightShift = integerNum >> 1;   //shifting each bit by 1 on right side

        System.out.println(rightShift);

        rightShift >>= 1;   //again shifting each bit by 1 on right side

        System.out.println(rightShift);
    }
}
