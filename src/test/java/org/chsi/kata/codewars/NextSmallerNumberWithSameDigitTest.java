package org.chsi.kata.codewars;

import org.junit.Ignore;
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
        assertEquals(117040, NextSmallerNumberWithSameDigit.nextSmaller(117400));
        assertEquals(1072, NextSmallerNumberWithSameDigit.nextSmaller(1207));
        assertEquals(2558258224755L, NextSmallerNumberWithSameDigit.nextSmaller(2558258225457L));
        assertEquals(1999999999999L, NextSmallerNumberWithSameDigit.nextSmaller(9199999999999L));
    }
}