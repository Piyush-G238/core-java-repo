package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        
        int sum = 10;
        
        for (int i = 0; i < 10; i++) {
            integerList.add(i, sum);
            sum += 10;
        }
        
        integerList.add(3, 55);
        
        System.out.println(integerList);
    }
}
