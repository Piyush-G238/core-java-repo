package com.java.io;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo3 implements FilenameFilter {
    String ext;

    public FileDemo3(String ext) {
        this.ext = ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(this.ext);
    }

    public static void main(String[] args) {
        FileDemo3 obj = new FileDemo3(".pdf");
        File myDir = new File("C:/Users/gupta/Downloads/study material");
        File[] listOfPdf = {};
        if (myDir.isDirectory()) {
            listOfPdf = myDir.listFiles(obj);
        }
        System.out.println("total number of files available : " + listOfPdf.length);
        for (File file : listOfPdf) {
            System.out.println("File name : " + file.getName());
        }
    }
}
