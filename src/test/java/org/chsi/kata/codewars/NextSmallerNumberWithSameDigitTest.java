package org.chsi.kata.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class NextSmallerNumberWithSameDigitTest {

    @Test
    public void nextSmaller() {
        assertEquals(12, NextSmallerNumberWithSameDigit.nextSmaller(21));
        assertEquals(790, NextSmallerNumberWithSameDigit.nextSmaller(907));
        assertEquals(513, NextSmallerNumberWithSameDigit.nextSmaller(531));
        assertEquals(-1, NextSmallerNumberWithSameDigit.nextSmaller(1027));
        assertEquals(414, NextSmallerNumberWithSameDigit.nextSmaller(441));
        assertEquals(123456789, NextSmallerNumberWithSameDigit.nextSmaller(123456798));
        assertEquals(153, NextSmallerNumberWithSameDigit.nextSmaller(315));
        assertEquals(117400, NextSmallerNumberWithSameDigit.nextSmaller(114700));
    }
}