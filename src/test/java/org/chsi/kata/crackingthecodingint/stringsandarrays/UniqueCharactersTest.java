package org.chsi.kata.crackingthecodingint.stringsandarrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueCharactersTest {

    @Test
    public void containsUniqueCharacters() {
        assertTrue(new UniqueCharacters().containsUniqueCharacters("helo"));
        assertTrue(new UniqueCharacters().containsUniqueCharacters2("helo"));
        assertTrue(new UniqueCharacters().containsUniqueCharacters3("haricot"));
        assertTrue(new UniqueCharacters().containsUniqueCharacters4("haricot"));
    }

    @Test
    public void containsMultipleOccurencesOfSameCharacter() {
        assertFalse(new UniqueCharacters().containsUniqueCharacters("aba"));
        assertFalse(new UniqueCharacters().containsUniqueCharacters2("aba"));
        assertFalse(new UniqueCharacters().containsUniqueCharacters3("bonjour"));
        assertFalse(new UniqueCharacters().containsUniqueCharacters4("bonjour"));
    }

}