package com.optionals;

import java.util.Objects;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object val = Optional.ofNullable("Hello")
                .orElseGet(() ->"default value");

        System.out.println(val);
    }
}
