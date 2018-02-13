package org.chsi.kata.crackingthecodingint.linkedlist;

public class LinkedListNode {

    int data;

    LinkedListNode next;

    public LinkedListNode(int data, LinkedListNode next) {
        this.data = data;
        this.next = next;
    }

    public int length() {
        int length = 1;
        LinkedListNode current = this;
        while(current.hasNext()) {
            current = current.next;
            length++;
        }
        return length;
    }

    public boolean hasNext() {
        return next != null;
    }

    @Override
    public boolean equals(Object obj) {
        return this.data == ((LinkedListNode) obj).data;
    }

    @Override
    public String toString() {
        return String.format("%s", data);
    }
}
