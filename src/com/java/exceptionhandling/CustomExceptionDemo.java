package com.java.exceptionhandling;

class InvalidRollNumber extends Exception {
    String msg;

    public InvalidRollNumber(String msg) {
        super();
        this.msg = msg;
        System.out.println(msg);
    }

}

class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) throws InvalidRollNumber {
        if (rollNo >= 76)
            throw new InvalidRollNumber("Roll number must be in between 1 to 75..");
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + "]";
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) throws InvalidRollNumber {
        Student student = new Student(88, "Piyush");
        System.out.println(student);
    }
}
