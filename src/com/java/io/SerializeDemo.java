package com.java.io;

import java.io.File;
// import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
// import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
    String name;
    int age;
    String phoneNo;
    String city;
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", phoneNo=" + phoneNo + ", city=" + city + ", profession="
                + profession + "]";
    }

    String profession;

    public Person(String name, int age, String phoneNo, String city, String profession) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.city = city;
        this.profession = profession;
    }
}

public class SerializeDemo {
    public static void main(String[] args) {
        File file = new File("C:\\projects\\core-java-repo\\src\\com\\java\\io", "sample.txt");
        Person person = new Person("piyush", 24, "123456", "New Delhi", "Coder");
        try (FileOutputStream fout = new FileOutputStream(file)) {
            ObjectOutputStream objOutput = new ObjectOutputStream(fout);
            objOutput.writeObject(person);
            objOutput.flush();
            objOutput.close();
            fout.flush();
            fout.close();
            System.out.println("written successfully..");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
