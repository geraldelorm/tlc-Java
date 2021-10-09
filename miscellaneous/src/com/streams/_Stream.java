package com.streams;

import java.util.List;
import java.util.stream.Collectors;

import static com.streams._Stream.Gender.*;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE),
                new Person("Bob", PREFER_NOT_TO_SAY)
        );

//        people.stream()
//                .map(person -> person.gender)
//                .collect(Collectors.toSet())
//                .forEach(gender -> System.out.println(gender));

//        people.stream()
//                .map(person -> person.name)
//                .mapToInt(name -> name.length())
//                .forEach(System.out::println);
//
        boolean containsOnlyfemales = people.stream()
                .allMatch(person -> FEMALE.equals(person.gender));

        System.out.println(containsOnlyfemales);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}