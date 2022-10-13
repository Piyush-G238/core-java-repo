/*=================================================
 * File : RelationalOperator.java
 * class : com.java.fundamentals
 * description : using relational operations in program
 *=================================================
 * s.no     date         user        description
 *  1     13.10.2022    Piyush         created
 * 
 * ================================================*/
package com.java.fundamentals;

public class RelationalOperator {
    public static void main(String[] args) {
        int operand1 = 25;
        int operand2 = 45;
        boolean result = operand1 <= operand2;
        boolean result1 = operand1 > 10;
        boolean result2 = operand2 <= 50;
        System.out.println(result1 + " " + result2);
        System.out.println(result1 != result2);
        System.out.println(result);
    }
}
