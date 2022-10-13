/*=================================================
 * File : GarbageCollection.java
 * class : com.java.fundamentals
 * description : calling garbage collector explicitly in program
 *=================================================
 * s.no     date         user        description
 *  1     13.10.2022    Piyush         created
 * 
 * ================================================*/
package com.java.fundamentals;

class Employee {
    String empName;
    int age;
    String company;

    public Employee(String empName, int age, String company) {
        this.empName = empName;
        this.age = age;
        this.company = company;
        System.out.println("object created");
    }

    @Override
    public String toString() {
        return "Employee [empName=" + empName + ", age=" + age + ", company=" + company + "]";
    }
    public void finalize(){
        System.out.println("Finalize method called..");
        System.out.println("Object gets destroyed..");
    }
}

public class GarbageCollection {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Piyush", 24, "TCS");
        emp1 = null;
        System.gc();
        System.out.println(emp1);
    }
}
