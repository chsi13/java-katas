package org.chsi.kata.crackingthecodingint.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class UrlifyTest {

    @Test
    public void encode() {
        assertEquals("Hello the world", "Hello\\%20the\\%20world");
    }
}