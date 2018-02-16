package org.chsi.kata.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class XOTest {

    @Test
    public void getXO() {
        assertTrue(XO.getXO("avbxXsssXooOe"));
        assertFalse(XO.getXO("avbxXsssXooOeoooooooooooo"));
    }
}