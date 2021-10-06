package com.turntabl;
import  java.util.*;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        System.out.println(new CalOps().apply("add").apply(7,2));
        System.out.println(new CalOps().apply("subtract").apply(7,2));
        System.out.println(new CalOps().apply("power").apply(7,2));

        List<String> list1 = Arrays.asList("1", "2", "3");
        List<String> list2 = Arrays.asList("4", "5", "6");

        System.out.println(new ZipImpl().apply(list1,list2));


        System.out.println(curryAdd(3));
    }

    public static int curryAdd (int n) {
        return new curryAdd().apply(n).apply(n);
    }

}
