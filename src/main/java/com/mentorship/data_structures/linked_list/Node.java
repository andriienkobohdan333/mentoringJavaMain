package com.mentorship.data_structures.linked_list;

public class Node<T> {
    T data;
    Node<T> prevItem;
    Node<T> nextItem;

    public  Node(T data) {
        this.data = data;
        this.prevItem = null; // null for first item
        this.nextItem = null; // null for first item
    }
}
