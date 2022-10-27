package com.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
// import java.io.ObjectOutputStream;

public class DeserializeDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {
        File file = new File("C:\\projects\\core-java-repo\\src\\com\\java\\io", "sample.txt");
        try {
            FileInputStream fin = new FileInputStream(file);
            ObjectInputStream objInput = new ObjectInputStream(fin);
            Person piyush = null;
            while (objInput.available() > 0) {
                piyush = (Person) objInput.readObject();
            }
            System.out.println(piyush);
            objInput.close();
            fin.close();
            System.out.println("reading of object from file done");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
