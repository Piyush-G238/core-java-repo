package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternClassDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("L[a-zA-z]*n");
        Pattern pattern2 = Pattern.compile("LV");

        Matcher matcher = pattern.matcher("LearnVern");
        Matcher matcher2 = pattern2.matcher("I said that LV stands for Learnvern");

        boolean atBegining = matcher2.lookingAt();
        
        boolean isThere = matcher2.find(10);

        if (isThere) {
            System.out.println("Pattern matches in string..");
        }else{
            System.out.println("Pattern does not matches in string...");
        }
        
        boolean isMatched = matcher.matches();
        if (isMatched) {
            System.out.println("Pattern matches...");
        }else{
            System.out.println("Pattern does not matches...");
        }
        
    }
}
