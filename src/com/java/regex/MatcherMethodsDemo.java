package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherMethodsDemo {
    public static void main(String[] args) {
        Pattern pattern1 = Pattern.compile("L[a-z]*n");
        Matcher matcher = pattern1.matcher("Learn from best experts at Learnvern, and enjoy ride of Learning");

        Pattern pattern2 = Pattern.compile("(Learn)(vern)");
        Matcher matcher2 = pattern2.matcher("Learn from best experts at Learnvern, and enjoy ride of Learning");

        while (matcher2.find()) {
            int currentIndex = matcher2.start(2);
            System.out.println(currentIndex);
        }
        
        while (matcher.find()) {
        int start = matcher.start();
        System.out.println(start);
        }
    }
}
