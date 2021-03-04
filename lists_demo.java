package com.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        int[] arr = {1,2,3};

        ArrayList<String> names = new ArrayList<>();
        names.add("super man"); // 0
        names.add("petter parker"); // 1
        names.add("wrong"); // 2
        names.remove(2);
        System.out.println(names);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(40);
        numbers.add(40);
        System.out.println(numbers);
        for (int index = 0; index < numbers.size(); index++) {
            System.out.println(numbers.get(index) * 2);
        }
        System.out.println(numbers.get(1));

        System.out.println(numbers.indexOf(40));

        // create a list of numbers with duplication of items
        // { 3, 5, 3, 3, 8, 12, 12, 15, 3 }
        //   0  1  2  3  4   5   6   7  8
        // 1. create a function which gets this list
        //    and a number (i.e. 12) find the last index of this number in the list
        //    i.e. here will return 6
        // 2. create a function which gets this list
        //    and a number (i.e. 3) and returns a list of indexes with this number
        //    i.e. here will return { 0, 2, 3, 8 }

    }

}
