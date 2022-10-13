/*=================================================
 * File : ReferenceVariable.java
 * class : com.java.fundamentals
 * description : Demo for reference variable in program
 *=================================================
 * s.no     date         user        description
 *  1     13.10.2022    Piyush         created
 * 
 * ================================================*/
package com.java.fundamentals;

class Student{
    String name;
    long rollno;

    public Student(String name, long rollno) {
        this.name = name;
        this.rollno = rollno;
    }
}
public class ReferenceVariable {
    public static void main(String[] args) {
        Student anuj = new Student("Anuj", 155486);
        int[] english_marks = new int[5];

        //memory address of the Student type object in heap memory
        System.out.println(anuj);   
        
        //memory address of integer array with size of 5 in heap memory
        System.out.println(english_marks);
    }
}
