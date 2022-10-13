/*=================================================
 * File : Typecasting.java
 * class : com.java.fundamentals
 * description : Demo for type casting in program
 *=================================================
 * s.no     date         user        description
 *  1     13.10.2022    Piyush         created
 * 
 * ================================================*/
package com.java.fundamentals;

public class TypeCasting {
    public static void main(String[] args) {
        int num = 78;
        char a = 'A';
        num = a;

        System.out.println("Integer \"num\" : "+ num);
        System.out.println("Character \"a\" : "+a);

        double doubleNum = num;

        System.out.println("Double \"doubleNum\" : "+ doubleNum);

        double doubleVal = 95.45;
        int intVal = (int) doubleVal;

        System.out.println("Integer \"intVal\" : "+intVal);
    }
}
