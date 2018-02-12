package org.chsi.kata.crackingthecodingint.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class RemoveDups {

    public LinkedListNode rmDups(LinkedListNode head) {
        Set<Integer> set = new HashSet<>();
        set.add(head.data);
        LinkedListNode current = head;
        while (current.next != null) {
            if (!set.add(current.next.data)) {
                LinkedListNode next = current.next.next;
                current.next = null;
                current.next = next;
                continue;
            }
            current = current.next;
        }
        return head;
    }

    public LinkedListNode rmDupsNoBuffer(LinkedListNode head) {
        //runner technique
        LinkedListNode current = head;
        LinkedListNode runner = current;

        while (current != null) {
            if (current.data == runner.data) {

            }
        }


        return head;
    }

}
