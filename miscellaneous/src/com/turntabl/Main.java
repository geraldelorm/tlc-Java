package com.turntabl;
import java.awt.*;

public class Main {


    public static void main(String[] args) {
        Lion lion = new Lion(Color.red, 20, Color.blue);
        lion.eat();

//    Animal ani = new Animal(Color.black, 80);
//    ani.eat();

        lion.insta(lion);

        lion.feed(lion);

        UseInter useInter = new UseInter();
        useInter.printVal();

        Aninterface.sttprint();

    }

}
