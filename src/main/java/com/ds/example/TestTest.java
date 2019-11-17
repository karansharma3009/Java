package com.ds.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestTest {

public static void main(String[] args) {

    HashMap<String,String> hm = new HashMap<String, String>();
    hm.put("1","Karan");
    hm.put("2","Namak");
    hm.put("3" ,"LAlan");

    Set<Map.Entry<String,String>> set = hm.entrySet();

    for (Map.Entry m : set)
    {
        System.out.println(m.getKey());
        System.out.println(m.getValue());
    }

    Collection<String> values = hm.values();
    System.out.println(values);
}
}
