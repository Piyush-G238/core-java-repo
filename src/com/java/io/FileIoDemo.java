package com.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIoDemo {
    public static void readingFile(FileInputStream fin) throws IOException {
        int ch = 0;
        while (ch != -1) {
            ch = fin.read();
            System.out.print((char)ch);
        }
    }

    public static void writeFile(FileOutputStream fout) {
        String str = "He stomped on his fruit loops and thus became a cereal killer.";
        byte[] strByte = str.getBytes();
        try {
            fout.write(strByte);
            fout.flush();
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException, FileNotFoundException {
        File file = new File("C:\\projects\\core-java-repo\\src\\com\\java\\io", "sample.txt");
        try {
            FileInputStream fin = new FileInputStream(file);
            FileOutputStream fout = new FileOutputStream(file);
            writeFile(fout);
            readingFile(fin);
            fout.flush();
            fout.close();
            fin.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
