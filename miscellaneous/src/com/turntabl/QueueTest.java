package com.turntabl;


import java.util.LinkedList;
import java.util.Queue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class QueueTest {
    @Test
    public void testQueueOperations(){
        Queue<Person> people = new LinkedList<Person>();
        Person gerald = new Person("Gerald");
        Person dan = new Person("Dan");

        people.add(gerald);
        people.offer(dan);

        assertEquals(people.element().getName(), "Gerald");

        Person p = people.poll();

        assertEquals(p.getName(), "Gerald");
        assertEquals(people.element().getName(), "Dan");

    }
}
