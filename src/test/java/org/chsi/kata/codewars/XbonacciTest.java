package org.chsi.kata.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class XbonacciTest {

    @Test
    public void tribonacci() {
        assertArrayEquals(new double []{1,1,1,3,5,9,17,31,57,105}, new Xbonacci().tribonacci(new double []{1,1,1},10), 1e-10);
        assertArrayEquals(new double []{0,0,1,1,2,4,7,13,24,44}, new Xbonacci().tribonacci(new double []{0,0,1},10), 1e-10);
        assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81}, new Xbonacci().tribonacci(new double []{0,1,1},10), 1e-10);
        assertArrayEquals(new double []{0,1}, new Xbonacci().tribonacci(new double []{0,1,1},2), 1e-10);
        assertArrayEquals(new double []{}, new Xbonacci().tribonacci(new double []{0,1,1},0), 1e-10);
    }
}