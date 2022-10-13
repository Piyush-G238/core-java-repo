/*=================================================
 * File : BitwiseOperators.java
 * class : com.java.fundamentals
 * description : using bitwise operations in program
 *=================================================
 * s.no     date         user        description
 *  1     13.10.2022    Piyush         created
 * 
 * ================================================*/

package com.java.fundamentals;

public class BitwiseOperator {
    public static void main(String[] args) {
        int operand1 = 5;
        int operand2 = 4;

        int andResult = operand1 & operand2;    // 00101 & 00100 = 00100 = 4

        int orResult = operand1 | operand2; //00101 | 00100 = 00101 = 5

        int xorResult = operand1 ^ operand2; //00101 ^ 00100 = 000001 = 1

        System.out.println(andResult);

        System.out.println(orResult);

        System.out.println(xorResult);
    }
}
