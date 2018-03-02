package org.chsi.kata.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void fibIterative() {
        assertEquals(5, Fibonacci.fibIterative(5));
        assertEquals(8, Fibonacci.fibIterative(6));
        assertEquals(13, Fibonacci.fibIterative(7));
        assertEquals(21, Fibonacci.fibIterative(8));
        assertEquals(34, Fibonacci.fibIterative(9));
        assertEquals(55, Fibonacci.fibIterative(10));
        assertEquals(75025, Fibonacci.fibRecursive(25));
    }

    @Test
    public void fibRecursive() {
        assertEquals(5, Fibonacci.fibRecursive(5));
        assertEquals(8, Fibonacci.fibRecursive(6));
        assertEquals(13, Fibonacci.fibRecursive(7));
        assertEquals(21, Fibonacci.fibRecursive(8));
        assertEquals(34, Fibonacci.fibRecursive(9));
        assertEquals(55, Fibonacci.fibRecursive(10));
        assertEquals(75025, Fibonacci.fibRecursive(25));
    }
}