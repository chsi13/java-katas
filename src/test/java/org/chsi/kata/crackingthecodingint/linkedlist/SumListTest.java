package org.chsi.kata.crackingthecodingint.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumListTest {

    @Test
    public void sumOk() {
        LinkedListNode inputA = LinkedListNode.of(1, 2, 3);
        LinkedListNode inputB = LinkedListNode.of(3, 4, 5);
        assertEquals(LinkedListNode.of(4, 6, 8), new SumList().sumForward(inputA, inputB));
        inputA = LinkedListNode.of(1, 0, 3);
        inputB = LinkedListNode.of(7, 5, 8);
        assertEquals(LinkedListNode.of(8, 6, 1), new SumList().sumForward(inputA, inputB));
        inputA = LinkedListNode.of(1, 0, 0);
        inputB = LinkedListNode.of(2, 5, 5);
        assertEquals(LinkedListNode.of(3, 5, 5), new SumList().sumForward(inputA, inputB));
    }

    @Test
    public void sumNok() {
        LinkedListNode inputA = LinkedListNode.of(1, 2, 3);
        LinkedListNode inputB = LinkedListNode.of(3, 4, 5);
        assertNotEquals(LinkedListNode.of(4, 6, 6), new SumList().sumForward(inputA, inputB));
    }
}