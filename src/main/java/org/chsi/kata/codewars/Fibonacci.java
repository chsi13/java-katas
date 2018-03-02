package org.chsi.kata.codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibRecursive(5));
        System.out.println(fibRecursive(6));
        System.out.println(fibRecursive(7));
        System.out.println(fibRecursive(8));
        System.out.println(fibRecursive(9));
        System.out.println(fibRecursive(10));
    }

    public static long fibIterative(int index) {
        if (precondition(index)) return index;

        int a = 0, b = 1;
        for (int i = 0; i < index - 1 ; i++) {
            int oldA = a;
            a = b;
            b += oldA;
        }
        return b;
    }

    public static long fibRecursive(int index) {
        if(index <= 1)
            return index;
        return fibRecursive(index - 1) + fibRecursive(index - 2);

    }

    private static boolean precondition(int index) {
        assert(index >= 0);
        if(index <= 1)
            return true;
        return false;
    }

}
