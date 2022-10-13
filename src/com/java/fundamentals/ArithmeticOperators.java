/*=================================================
 * File : ArithmeticOperators.java
 * class : com.java.fundamentals
 * description : using arithmetic operations in program
 *=================================================
 * s.no     date         user        description
 *  1     13.10.2022    Piyush         created
 * 
 * ================================================*/
package com.java.fundamentals;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int operand1 = 95;
        int operand2 = 85;

        int sum = operand1 + operand2;
        int difference = operand1 - operand2;
        int product = operand1 * operand2;
        int quotient = (int) operand1 / operand2;
        int remainder = (int) operand1 % operand2;

        System.out.println(sum);    //180
        System.out.println(difference); //10
        System.out.println(product);    //8075
        System.out.println(quotient);   //1
        System.out.println(remainder);  //10
    }
}
