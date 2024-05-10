package com.mentorship.data_structures;

import com.mentorship.data_structures.linked_list.DoubleLinkedList;
import com.mentorship.data_structures.linked_list.Node;
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

        assertEquals(3, doubleLinkedList.size()); //TODO use hamcrest
    }

    @Test
    public void clearList(){
        doubleLinkedList.add(5);
        doubleLinkedList.add(7);
        doubleLinkedList.add(9);

        doubleLinkedList.clearList();

        assertEquals(0, doubleLinkedList.size());
    }

//    @Test
//    public void deleteAbsentValue() { //TODO need to add some handling NullPointerException when findItem returns null
//        doubleLinkedList.add(5);
//        doubleLinkedList.add(7);
//        doubleLinkedList.add(9);
//        Node<Integer> absentNode = doubleLinkedList.findItem(2);
//        doubleLinkedList.delete(absentNode);
//        assertEquals(0, doubleLinkedList.size());
//    }
    //TODO need to cover all methods for DoubleLinkedList with appropriate test

    @Test
    public void deleteAbsentValue() { //TODO need to add some handling NullPointerException when findItem returns null
        doubleLinkedList.add(5);
        doubleLinkedList.add(7);
        doubleLinkedList.add(9);

        Node<Integer> node = doubleLinkedList.findItem(5);
        Node<Integer> node2 = doubleLinkedList.findItem(9);

        doubleLinkedList.delete(node);
        doubleLinkedList.delete(node2);

        assertEquals(1, doubleLinkedList.size());
    }
}
