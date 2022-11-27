//Collection Framework is a set of classes and interfaces that implement commonly reusable collection of data structures

package com.java.collections;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        int[] numberArray = { 1, 2, 3, 4, 5 };

        ArrayList<Integer> intList = new ArrayList<>();
        for (int num : numberArray) {
            intList.add(num);
        }

        for (int i = 6; i <= 10; i++) {
            intList.add(i);
        }

        System.out.println(intList);

        Integer a = intList.get(0);

        Integer index = intList.indexOf(121);

        System.out.println(a + " " + index);
    }
}
