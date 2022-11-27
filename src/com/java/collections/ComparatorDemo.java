package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getRollNumber() - o1.getRollNumber();
    }

}
public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("A", 97));
        students.add(new Student("B", 55));
        students.add(new Student("C", 25));
        students.add(new Student("D", 12));
        students.sort(new StudentComparator());

        // Arrays.sort(null, null);
        for (Student st : students) {
            System.out.println(st.getRollNumber());
        }
    }
}
