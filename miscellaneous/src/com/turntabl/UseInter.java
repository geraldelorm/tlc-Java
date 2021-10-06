package com.turntabl;

public class UseInter implements Aninterface, B{

    @Override
    public void printVal() {
        B.super.printVal();
    }
}
