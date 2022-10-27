package com.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
    public static void main(String[] args) {
        File file = new File("C:\\projects\\core-java-repo\\src\\com\\java\\io", "sample.txt");
        try {
            FileOutputStream fout = new FileOutputStream(file);
            String str = "I am a passionate coder";
            byte[] b = str.getBytes();
            fout.write(b);
            fout.flush();
            fout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Writing operation on file is done..");
    }
}
