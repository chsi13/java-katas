package org.chsi.kata.crackingthecodingint.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class KthToLastTest {

    @Test
    public void kthToLast() {
        LinkedListNode head = new LinkedListNode(1,
                    new LinkedListNode(2,
                            new LinkedListNode(3,
                                    new LinkedListNode(4,
                                            new LinkedListNode(5,
                                                    new LinkedListNode(6, null))))));

        assertEquals(2, new KthToLast().kthToLast(head, 2));
    }


}