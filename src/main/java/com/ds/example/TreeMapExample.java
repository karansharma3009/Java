package com.ds.example;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        TreeMap<String,String> tm = new TreeMap<String,String>();
        tm.put("a","aaaaa");
        tm.put("b","baaaaa");
        tm.put("c","caaaaa");
        tm.put("d","daaaaa");

        System.out.println(tm);

// desc Order
       // If obj1.compareTo(obj2) returns a negative number, then obj1 is logically less than obj2.
        //If obj1.compareTo(obj2) returns positive number then obj1 is logically greater than obj2
        //If obj1.compareTo(obj2) returns zero, then obj1 is equal to obj2.


        TreeMap<String,String> tm2 = new TreeMap<String,String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
             return  o2.compareTo(o1);

            };
        });
        tm2.put("a","aaaaa");
        tm2.put("b","baaaaa");
        tm2.put("c","caaaaa");
        tm2.put("d","daaaaa");

        System.out.println(tm2);

// Ascending ORDER
        TreeMap<String,String> tm3 = new TreeMap<String,String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return  o1.compareTo(o2);

            };
        });
        tm3.put("a","aaaaa");
        tm3.put("b","baaaaa");
        tm3.put("c","caaaaa");
        tm3.put("d","daaaaa");

        System.out.println(tm3);


    }
}
