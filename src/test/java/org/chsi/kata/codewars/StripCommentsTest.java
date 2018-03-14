package org.chsi.kata.codewars;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class StripCommentsTest {

    @Test
    public void stripComments() {
        assertEquals(
                "apples, pears\ngrapes\nbananas",
                StripComments.stripComments( "apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" } )
        );

        assertEquals(
                "a\nc\nd",
                StripComments.stripComments( "a #b\nc\nd $e f g", new String[] { "#", "$" } )
        );
    }
}