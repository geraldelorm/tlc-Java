package com.optionals;

import java.util.Optional;

public class Processor {

    public Integer calc(Optional<Integer> num1, Optional<Integer> num2){
        System.out.println("'num1' is present: " + num1.isPresent());
        System.out.println("'num2' is present: " + num2.isPresent());

        Integer v1 = num1.orElse(Integer.valueOf(0));

//        Integer v2 = num2.get();
        Integer v2 = num2.orElseThrow();

        return v1 + v2;
    }
}
