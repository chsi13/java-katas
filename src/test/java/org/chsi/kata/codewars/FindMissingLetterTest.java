package org.chsi.kata.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMissingLetterTest {

    @Test
    public void findMissingLetter() {
        assertEquals('e', FindMissingLetter.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', FindMissingLetter.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
}