package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern ptr = Pattern.compile("f[a-z]*k");
        Matcher mat = ptr.matcher("facebook");
        boolean isMatched = mat.matches();
        if (isMatched)
            System.out.println("pattern matched");
        else
            System.out.println("pattern does'nt matched");
    }
}
