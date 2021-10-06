package com.turntabl;

public class UseInterface implements A, B{

    @Override
    public void printVal() {
        B.super.printVal();
    }
}
