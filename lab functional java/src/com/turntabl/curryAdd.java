package com.turntabl;

import java.util.function.Function;

public class curryAdd implements Function<Integer,Function<Integer,Integer>> {
    @Override
    public Function<Integer, Integer> apply(Integer integer) {
        class add implements Function<Integer,Integer> {
            @Override
            public Integer apply(Integer i) {
                return i + 2;
            }
        }
        return new add();
    }
}
