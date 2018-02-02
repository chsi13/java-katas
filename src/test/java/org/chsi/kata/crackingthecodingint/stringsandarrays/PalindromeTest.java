package org.chsi.kata.crackingthecodingint.stringsandarrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void isAPalindrome() {
        assertTrue(new Palindrome().isAPalindrome("ressasser"));
        assertTrue(new Palindrome().isAPalindrome("ada"));
        assertTrue(new Palindrome().isAPalindrome("aa"));
        assertTrue(new Palindrome().isAPalindrome("snobons"));
    }

    @Test
    public void isNotAPalindrome() {
        assertFalse(new Palindrome().isAPalindrome("test"));
    }
}