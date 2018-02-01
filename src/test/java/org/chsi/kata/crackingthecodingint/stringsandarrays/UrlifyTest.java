package org.chsi.kata.crackingthecodingint.stringsandarrays;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class UrlifyTest {

    @Test
    public void encode() {
        assertTrue(Arrays.equals(new char[] {'%','2','0','a','%','2','0','%','2','0','b','c','%','2','0'}, new Urlify().encode(new char[]{' ','a', ' ',' ', 'b', 'c', ' '})));
    }
}