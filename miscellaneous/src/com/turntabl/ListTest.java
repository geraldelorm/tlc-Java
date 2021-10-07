package com.turntabl;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListTest {
    @Test
    public void testListBehaviour() {
        List<Person> people = new ArrayList<>();
        Person gerald = new Person("Gerald");
        Person dan = new Person("Dan");


        // add elements to the list
        people.add(gerald);
        people.add(dan);

        Person p = people.get(0);

        assertEquals(p.getName(), "Gerald");
    }
}
