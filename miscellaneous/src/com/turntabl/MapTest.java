package com.turntabl;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MapTest {

    @Test
    public void testMapOperations() {
        Map<String, Person> people = new HashMap<String, Person>();
        Person gerald = new Person("Gerald", 25);
        Person dan = new Person("Dan", 30);

        people.put(gerald.getName(), gerald);
        people.put(dan.getName(), dan);

        assertTrue(people.containsKey(gerald.getName()));
        assertTrue(people.containsValue(dan));

        assertEquals(people.get(gerald.getName()).getAge(), 25);
    }

}
