package com.functional;

import java.util.function.Predicate;

public class SquareOf5 implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer == 5*5;
    }
}
