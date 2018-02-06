package org.chsi.kata.crackingthecodingint.stringsandarrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncoderTest {

    @Test
    public void encode() {
        assertEquals("a2c2b2", new Encoder().encode("aaccbb"));
        assertEquals("a3c1z3t2", new Encoder().encode("aaaczzztt"));
        assertEquals("abc", new Encoder().encode("abc"));
        assertEquals("abc", new Encoder().encode2("abc"));
        assertEquals("a2c2b2", new Encoder().encode2("aaccbb"));
    }


}