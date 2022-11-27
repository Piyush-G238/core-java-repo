package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
    public static void main(String args[]) {
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        if (m.find()) {
            String str1 = m.group(0);
            String str2 = m.group(1);
            String str3 = m.group(2);
            System.out.println("Found value: " + str1);
            System.out.println("Found value: " + str2);
            System.out.println("Found value: " + str3);
        } else {
            System.out.println("NO MATCH");
        }
    }
}
