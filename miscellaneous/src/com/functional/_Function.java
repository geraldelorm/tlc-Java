package com.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int incremented1 = increment(1);
        System.out.println(incremented1);

        int incremented2 = incrementByOneFunc.apply(1);
        System.out.println(incremented2);

        int multiplied = multipleBy10Func.apply(incremented2);
        System.out.println(multiplied);

        Function<Integer, Integer> addAndMultiply = incrementByOneFunc.andThen(multipleBy10Func);
        System.out.println(addAndMultiply.apply(4));


        int biResult = incrementByOneAndMultiplyBiFunc.apply(1, 10);
        System.out.println(biResult);

        System.out.println(biResult);
    }

    static Function<Integer, Integer> incrementByOneFunc = num -> num + 1;

    static Function<Integer, Integer> multipleBy10Func = num -> num*10;

    static int increment(int num) {
        return  num + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunc =
            (numberToIncrentByOne, numberToMultiplyBy) -> (numberToIncrentByOne + 1) * numberToMultiplyBy;
}
