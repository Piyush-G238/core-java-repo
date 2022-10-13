/*=================================================
 * File : DataTypes.java
 * class : com.java.fundamentals
 * description : using different data types in program
 *=================================================
 * s.no     date         user        description
 *  1     13.10.2022    Piyush         created
 * 
 * ================================================*/
package com.java.fundamentals;

public class DataTypes {
    public static void main(String[] args) {
        int integerNum = 10;

        char ch = 'A';

        float floatNum = 20.22f;

        double doubleNum = 30.99;

        byte byteNum = 1;

        boolean boolValue = false;

        long longNum = 38l;

        System.out.println(integerNum+" ="+Integer.BYTES+" bytes");

        System.out.println(ch+" ="+Character.BYTES+" bytes");

        System.out.println(floatNum+" ="+Float.BYTES+" bytes");

        System.out.println(doubleNum+" ="+Double.BYTES+" bytes");

        System.out.println(byteNum+" ="+Byte.BYTES+" bytes");

        System.out.println(boolValue);

        System.out.println(longNum+" ="+Long.BYTES+" bytes");
    }
}
