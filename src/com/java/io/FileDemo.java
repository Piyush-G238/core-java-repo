package com.java.io;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File textFile = new File("C:\\projects\\core-java-repo\\src\\com\\java\\io", "sample.txt");
        String absPath = textFile.getAbsolutePath();
        boolean fileExist = textFile.exists();
        boolean fileReadable = textFile.canRead();
        boolean fileWriteble = textFile.canWrite();
        System.out.println("Absolute path : " + absPath);
        System.out.println("Does file exist ? : " + fileExist);
        System.out.println("can we read this file ? : " + fileReadable);
        System.out.println("can we write this file ? : " + fileWriteble);
    }
}
