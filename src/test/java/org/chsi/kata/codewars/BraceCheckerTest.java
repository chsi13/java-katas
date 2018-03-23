package org.chsi.kata.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class BraceCheckerTest {

    @Test
    public void isValid() {
        assertTrue(BraceChecker.isValid("{}"));
        assertTrue(BraceChecker.isValid("({{}})"));
    }

    @Test
    public void isInvalid() {
        assertFalse(BraceChecker.isValid("{{})"));
        assertFalse(BraceChecker.isValid("(({{}})"));
    }
}