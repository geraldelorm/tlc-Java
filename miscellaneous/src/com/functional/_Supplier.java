package com.functional;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnetionUrl());
        System.out.println(getDBConnnectionFunc);
    }

    static String getDBConnetionUrl() {
        return "localhost:8080/users";
    }

    static Supplier<String> getDBConnnectionFunc = () -> "localhost/blablablaaaa";
}
