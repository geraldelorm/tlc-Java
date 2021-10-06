package com.turntabl;

public interface B {
    int value = 2000;

    default public void printVal(){
        System.out.println(value);
    };
}
