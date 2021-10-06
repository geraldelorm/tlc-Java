package com.turntabl;

import java.awt.*;


public class Lion extends Animal{
    private Color lionColor;

    public Lion(Color color, int size, Color lionc) {
        super();
        this.lionColor = lionc;
    }

    @Override
    public void eat(){
        System.out.println("Lions also Eat");
    }
}