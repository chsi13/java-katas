package org.chsi.kata.crackingthecodingint.linkedlist;

public class MiddleNode {

    void deleteNode(LinkedListNode middleNode) {
        if(middleNode == null ||middleNode.next == null) return;

        int saveData = middleNode.data;
        middleNode.data = middleNode.next.data;
        middleNode.next = middleNode.next.next;
    }
}
