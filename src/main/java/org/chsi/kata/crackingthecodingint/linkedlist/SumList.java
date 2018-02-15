package org.chsi.kata.crackingthecodingint.linkedlist;

import java.util.Arrays;

public class SumList {

    public LinkedListNode sumForward(LinkedListNode a, LinkedListNode b) {
       long addition = extract(a) + extract(b);
       String additionToText = String.valueOf(addition);
       int[] intArray = new int[additionToText.length()];
       for(int i = 0; i < additionToText.length(); i++) {
            intArray[i] = Integer.parseInt("" + additionToText.charAt(i));
       }
       return LinkedListNode.of(intArray);
    }

    private long extract (LinkedListNode node) {
        StringBuilder value = new StringBuilder(node.data);
        LinkedListNode current = node;
        while(current != null) {
            value.append(current.data);
            current = current.next;
        }
        return Long.valueOf(value.toString());
    }

}
