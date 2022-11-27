package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
    public static void main(String[] args) {
        Pattern ptr = Pattern.compile("Tech");
        Matcher match = ptr.matcher("New industry field is evolving as FinTech, EduTech");
        boolean isFound = match.find();
        if (match.lookingAt()) {
            System.out.println("pattern matched at begining");
        } else if (isFound) {
            System.out.println("pattern found");
        } else {
            System.out.println("pattern did not matched");
        }
    }
}
