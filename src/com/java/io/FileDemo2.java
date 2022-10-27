package com.java.io;

import java.io.File;

public class FileDemo2 {
    public static File[] listOfFileObj(){
        return null;
    }
    public static void main(String[] args) {
        File file = new File("C:/Users/gupta/Downloads/study material");

        // String[] fileList = null;

        // if(file.isDirectory()){
        //     fileList = file.list();
        // }
    
        // for (String str : fileList) {
        //     System.out.println(str);
        // }

        File[] fileCollection = file.listFiles();
        for (File e : fileCollection) {
            String fileName = e.getName();
            boolean isFile = e.isFile();
            if(isFile)
                System.out.println(fileName + " is a file.");
            else
                System.out.println(fileName+" is not a file");
            
        }
    }
}