package com.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo {
    public static void main(String[] args) {
        File file = new File("C:\\projects\\core-java-repo\\src\\com\\java\\io", "sample.txt");
        try {
            FileInputStream fin = new FileInputStream(file);
            byte[] b = fin.readAllBytes();
            for (byte ch : b) {
                System.out.print((char) ch);
            }
            fin.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
