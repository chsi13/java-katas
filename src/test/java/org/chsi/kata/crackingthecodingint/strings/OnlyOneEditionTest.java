package org.chsi.kata.crackingthecodingint.strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OnlyOneEditionTest {

    @Test
    public void onlyOneCharacterHasChanged() {
        assertTrue(new OnlyOneEdition().onlyOneCharacterHasChanged("abc", "aec"));
    }

    @Test
    public void onlyOneCharacterHasChangedImpl2() {
        assertTrue(new OnlyOneEdition().onlyOneCharacterHasChanged2("abc", "aec"));
    }

    @Test
    public void moreThanOneCharacterHasChanged() {
        assertFalse(new OnlyOneEdition().onlyOneCharacterHasChanged("abc", "aecd"));
    }

    @Test
    public void moreThanOneCharacterHasChangedImpl2() {
        assertFalse(new OnlyOneEdition().onlyOneCharacterHasChanged2("abc", "aecd"));
    }
}