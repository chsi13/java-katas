package org.chsi.kata.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductFibonacciTest {

    @Test
    public void test1() {
        long[] r = new long[] {55, 89, 1};
        assertArrayEquals(r, ProductFibonacci.productFib(4895));
    }
    @Test
    public void test2() {
        long[] r = new long[] {89, 144, 0};
        assertArrayEquals(r, ProductFibonacci.productFib(5895));
    }

    @Test
    public void test3() {
        long[] r = new long[] {21, 34, 1};
        assertArrayEquals(r, ProductFibonacci.productFib(714));
    }
}