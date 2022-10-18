package com.java.inheritance;

class Person {
    protected String person_name;
    protected int age;
    protected long phone_no;

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(long phone_no) {
        this.phone_no = phone_no;
    }
}

class Employee extends Person {
    private long employee_id;
    private String designation;
    private String company;

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setEmployee_id(12345);
        emp.setDesignation("Software Developer");
        emp.setCompany("tcs");
        emp.setPerson_name("Piyush");
        emp.setAge(24);
        emp.setPhone_no(123456);
        
        System.out.println(
                "Name : " + emp.getPerson_name() + ", \n" +
                        "Age : " + emp.getAge() + ",\n" +
                        "Phone no : " + emp.getPhone_no());

        System.out.println(
                "Employee Id : " + emp.getEmployee_id() + ", \n" +
                        "Designation : " + emp.getDesignation() + ", \n" +
                        "Company : " + emp.getCompany());
    }
}