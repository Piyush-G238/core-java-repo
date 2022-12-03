package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClassDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[^a-e][A-E]");
        Matcher matcher = pattern.matcher("eD");
        System.out.println(matcher.matches());

        Pattern pattern2 = Pattern.compile("[0-9]{2}");
        Matcher matcher2 = pattern2.matcher("87");
        System.out.println(matcher2.matches());

        boolean isMatches = Pattern.matches("[0-9]?", "5");
        System.out.println(isMatches);

        System.out.println(Pattern.matches("\\d", "0"));
        System.out.println(Pattern.matches("\\D", "$"));
        System.out.println(Pattern.matches("\\s\\D", "z"));
        System.out.println(Pattern.matches(".*@gmail\\.?com", "abc@gmail.com"));
    }
}
