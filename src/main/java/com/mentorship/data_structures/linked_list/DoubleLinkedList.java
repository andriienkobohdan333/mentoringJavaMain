package com.mentorship.data_structures.linked_list;

public class DoubleLinkedList<T> {
    Node<T> head = null;
    Node<T> tail = null;

    //adding new item
    public void add(T data) {
        Node<T> newItem = new Node<>(data);
        if (head == null) {
            head = newItem;
            tail = newItem;
        } else {
            tail.nextItem = newItem;
            newItem.prevItem = tail;
            tail = newItem;
        }
    }
    public void delete(Node<T> node) {
        if(node == head) {
            head = node.nextItem;
        }
        if(node == tail) {
            tail = node.prevItem;
        }
        if (node.prevItem != null)
        {node.prevItem.nextItem = node.prevItem;}
        if (node.nextItem != null)
        {node.nextItem.prevItem = node.prevItem;}
    }

    public void clearList() {
        head = null;
        tail = null;
    }

    public int size() {
        int count = 0;
        Node<T> currentLink = head;
        while (currentLink != null) {
            count++;
            currentLink = currentLink.nextItem;
        }
        return count;
    }
}
