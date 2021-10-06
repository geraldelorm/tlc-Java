package com.turntabl;

public interface Aninterface {
    int value = 1000;

    default public void printVal(){
        System.out.println(value);
    };

    static void sttprint(){
        System.out.println("Static method in inter");
    }
}
