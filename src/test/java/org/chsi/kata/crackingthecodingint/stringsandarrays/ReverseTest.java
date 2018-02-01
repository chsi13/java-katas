package org.chsi.kata.crackingthecodingint.stringsandarrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {

    @Test
    public void hasPermut() {
        assertTrue(new Reverse().isReverse("abc", "cab"));
    }
}