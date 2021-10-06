package com.turntabl;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
