package com.functional;

import java.util.function.Function;

public class DobleIt implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer integer) {
        return integer * 2;
    }
}
