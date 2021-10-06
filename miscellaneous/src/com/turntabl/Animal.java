package com.turntabl;

import java.awt.*;

public abstract class Animal {
    private Color color;
    private int size;

    public Animal(){

    }
    public Animal(Color color, int size){
        this.color = color;
        this.size = size;
    }

    public abstract void eat();

    public void insta(Object object){
        if (object instanceof Animal){
            Animal thisAnimal = (Animal)object;
            System.out.println(thisAnimal.getClass().getName() + ":  is an Instance of Animal");
        } else {
            System.out.println(object.getClass().getName() + ":  is not an Instance of Animal");
        }
    }

    public void feed(Animal animal){
        animal.eat();
    }
}

