package com.company;

import com.company.MyHashSet;
import com.company.mySet;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        mySet<String> set = new MyHashSet();
        set.add("one");
        System.out.println(Arrays.toString(set.toArray()));
        System.out.println(set.contains("one"));
        System.out.println(set.size());
        set.remove("one");
        System.out.println(set.size());
        set.add("three");
        set.add("four");
        set.add("five");
        set.add("six");
        set.add("seven");
        System.out.println(Arrays.toString(set.toArray()));
        System.out.println(set.size());
        set.clear();
        System.out.println(Arrays.toString(set.toArray()));
        System.out.println(set.isEmpty());

    }
}