package com.turntabl;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<Person>( new NameOrder());

        people.add(new Person("Gee", 90));
        people.add(new Person("Danny", 35));
        people.add(new Person("Mack", 60));
        people.add(new Person("Ama", 10));

        for (Person p : people){
            System.out.println(p.getName() + ": " + p.getAge());
        }
    }
}
