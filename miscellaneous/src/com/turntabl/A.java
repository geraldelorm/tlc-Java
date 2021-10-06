package com.turntabl;

public interface A {
    int value = 1000;

    default public void printVal(){
        System.out.println(value);
    };

    static void staticPrint(){
        System.out.println("Static method in inter");
    }
}
