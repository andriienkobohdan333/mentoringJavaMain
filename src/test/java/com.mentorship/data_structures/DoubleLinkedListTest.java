package com.mentorship.data_structures;

import com.mentorship.data_structures.linked_list.DoubleLinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoubleLinkedListTest {
    private DoubleLinkedList<Integer> doubleLinkedList;

    @Before
    public void setUp() {
        doubleLinkedList = new DoubleLinkedList<>();
    }

    @Test
    public void add(){
        doubleLinkedList.add(5);
        doubleLinkedList.add(7);
        doubleLinkedList.add(9);

        assertEquals(3, doubleLinkedList.size());
    }

    @Test
    public void clearList(){
        doubleLinkedList.add(5);
        doubleLinkedList.add(7);
        doubleLinkedList.add(9);

        doubleLinkedList.clearList();

        assertEquals(0, doubleLinkedList.size());
    }
    //TODO need to cover all methods for DoubleLinkedList with appropriate test

}
