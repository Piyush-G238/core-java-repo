package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceMethodDemo {
    public static void main(String[] args) {
        String s1 = "Welcome     to Learnvern,    and Enjoy your     Learning";
        Pattern pattern = Pattern.compile("\\s{2,}");
        Matcher matcher = pattern.matcher(s1);
        String replaceString1 = matcher.replaceAll(" ");
        System.out.println(s1);
        System.out.println(replaceString1);
    }
}
