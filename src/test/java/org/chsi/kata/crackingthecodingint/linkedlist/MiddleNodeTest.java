package org.chsi.kata.crackingthecodingint.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleNodeTest {

    @Test
    public void deleteNode() {

        LinkedListNode head = new LinkedListNode(1,
                new LinkedListNode(2,
                        new LinkedListNode(3,
                                new LinkedListNode(4,
                                        new LinkedListNode(5,
                                                new LinkedListNode(6, null))))));


        assertEquals(4, head.next.next.next.data);

        new MiddleNode().deleteNode(head.next.next.next);

        assertEquals(5, head.next.next.next.data);


    }
}