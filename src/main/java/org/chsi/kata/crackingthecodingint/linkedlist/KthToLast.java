package org.chsi.kata.crackingthecodingint.linkedlist;

public class KthToLast {

    public int kthToLast(LinkedListNode head, int k) {
        LinkedListNode pointer = head;
        for(int i = 1; i < k ; i++){
            pointer = pointer.next;
        }
        return pointer.data;
    }

}
