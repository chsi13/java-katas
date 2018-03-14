package org.chsi.kata.codewars;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class RemovedNumbersTest {

    @Test
    public void removedNb() {
        List<long[]> expected = List.of(new long[]{15,21}, new long[]{21,15});
        List<long[]> actual = RemovedNumbers.removedNb(26);
        assertEquals(expected.size(), actual.size());
        IntStream.range(0, expected.size() - 1).forEach(index -> assertArrayEquals(expected.get(index), actual.get(index)));
        }
}