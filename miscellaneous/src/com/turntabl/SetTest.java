package com.turntabl;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetTest {
    @Test
    public void testSetAddRemove(){
        Set<Person> people = new HashSet<>();
        Person gerald = new Person("Gerald");
        Person dan = new Person("Dan");

        people.add(gerald);
        people.add(dan);

        assertTrue(people.contains(dan));

        people.remove(dan);
        assertFalse(people.contains(dan));
        assertTrue(people.contains(gerald));
    }
}
