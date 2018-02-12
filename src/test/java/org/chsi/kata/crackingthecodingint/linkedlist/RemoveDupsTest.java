package org.chsi.kata.crackingthecodingint.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDupsTest {

    @Test
    public void rmDups() {
        LinkedListNode node = new LinkedListNode(1,
                                new LinkedListNode(2,
                                        new LinkedListNode(3,
                                                new LinkedListNode(5, null))));
        assertTrue(node.length() == 4);
        assertEquals(4,new RemoveDups().rmDups(node).length());
    }


}