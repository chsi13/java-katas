package org.chsi.kata.crackingthecodingint.stringsandarrays;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OnlyOneEditionTest {

    @Test
    public void onlyOneEdition() {
        assertTrue(new OnlyOneEdition().onlyOneCharacterHasChanged("abc", "adbc"));
    }


    @Test
    public void moreThanOneEdition() {
        assertFalse(new OnlyOneEdition().onlyOneCharacterHasChanged("abc", "aecd"));
    }

}