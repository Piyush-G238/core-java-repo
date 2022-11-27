package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndexMethodDemo {
    public static void main(String[] args) {
        Pattern ptr = Pattern.compile("L[a-z]*n");
        Matcher match = ptr.matcher("best experts provides best Learn");
        // match.start();
        boolean flag = match.find();
        if(flag){
            System.out.println(match.start());
            System.out.println(match.end());
        }
    }
}
