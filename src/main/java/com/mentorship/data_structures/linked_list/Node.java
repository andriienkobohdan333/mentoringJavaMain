package com.mentorship.data_structures.linked_list;

public class Node<T> {
    T data;
    Node<T> prevItem; //null if we don't initialize
    Node<T> nextItem; //null if we don't initialize

    public Node(T data) {
        this.data = data;
        this.prevItem = null; // null for first item
        this.nextItem = null; // null for first item
    }
}
