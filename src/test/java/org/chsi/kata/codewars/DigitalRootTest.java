package org.chsi.kata.codewars;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DigitalRootTest {
    @Test
    public void digital_root() {
            assertEquals(7, DigitalRoot.digital_root(16) );
            assertEquals(6, DigitalRoot.digital_root(132189) );
            assertEquals(2, DigitalRoot.digital_root(493193) );
    }
}