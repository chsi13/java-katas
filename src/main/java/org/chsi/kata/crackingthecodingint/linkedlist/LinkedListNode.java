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
        LinkedListNode toCompare = (LinkedListNode) obj;
            if(this.data == toCompare.data) {
                if(this.next != null && toCompare.next != null) {
                    return this.next.equals(toCompare.next);
                }
                return true;
            }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s", data);
    }

    public static LinkedListNode of(int... values) {
        LinkedListNode result  = new LinkedListNode(values[0], null);
        LinkedListNode pointer = result;
        for (int i  = 1; i < values.length; i ++) {
            pointer.next = new LinkedListNode(values[i], null);
            pointer = pointer.next;
        }
        return result;
    }
}
