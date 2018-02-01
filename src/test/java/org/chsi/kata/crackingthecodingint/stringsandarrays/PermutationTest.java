package org.chsi.kata.crackingthecodingint.stringsandarrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationTest {

    @Test
    public void hasPermutViaSort() {
        assertTrue(new Permutation().hasPermut("aab", "aba"));
    }

    @Test
    public void hasPermutViaDeletion() {
        assertTrue(new Permutation().hasPermut2("chris", "ihcra"));
    }
}