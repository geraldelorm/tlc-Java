package com.turntabl;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {


    public static void main(String[] args) {
//        Lion lion = new Lion(Color.red, 20, Color.blue);
//        lion.eat();
//
////    Animal ani = new Animal(Color.black, 80);
////    ani.eat();
//
//        lion.insta(lion);
//
//        lion.feed(lion);
//
//        UseInterface useInterface = new UseInterface();
//        useInterface.printVal();
//
//        A.staticPrint();
//
//
//        List<Person> people = new ArrayList<Person>();
//        Person gerald = new Person("Gerald");
//        Person dan = new Person("Dan");
//
//        people.add(gerald);
//        people.add(dan);
//
//        for (Person person: people){
//            System.out.println(person.getName());
//        }
//
//        Iterator<Person> iterable = people.iterator();
//        while (iterable.hasNext()){
//            Person el = iterable.next();
//
//            System.out.println(el.getName());
//        }


        List<Person> pep = new ArrayList<Person>();
        pep.add(new Person("Gee", 70));
        pep.add(new Person("Danny", 90));
        pep.add(new Person("Mack", 57));
        pep.add(new Person("Ama", 30));


        Collections.sort(pep);
        for(Person p : pep){
            System.out.println(p.getName());
        }
    }
}
