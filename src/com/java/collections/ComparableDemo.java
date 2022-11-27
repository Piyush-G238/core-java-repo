package com.java.collections;

import java.util.Arrays;

class Student implements Comparable<Student> {

    private String name;
    private int rollNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Student(String name, int rollNumber) {
        this.setName(name);
        this.setRollNumber(rollNumber);
    }

    @Override
    public int compareTo(Student o) {
        return this.rollNumber - o.rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

}

public class ComparableDemo {
    public static void main(String[] args) {
        Student[] studentList = new Student[4];
        studentList[0] = new Student("A", 56);
        studentList[1] = new Student("B", 14);
        studentList[2] = new Student("C", 23);
        studentList[3] = new Student("D", 10);

        Arrays.sort(studentList);

        for (Student stud : studentList) {
            System.out.println(stud.getRollNumber());
        }
    }
}