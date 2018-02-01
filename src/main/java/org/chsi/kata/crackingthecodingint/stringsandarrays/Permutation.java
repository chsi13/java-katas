package org.chsi.kata.crackingthecodingint.stringsandarrays;

import java.util.Arrays;

public class Permutation {

    // Sort implementation
    public boolean hasPermut(String original, String test) {
        if(original.length() != test.length()) return false;

        char[] originalAsChars = original.toCharArray();
        char[] testAsChars = test.toCharArray();
        Arrays.sort(originalAsChars);
        Arrays.sort(testAsChars);

        return Arrays.equals(originalAsChars, testAsChars);
    }

    // Deletion implementation
    public boolean hasPermut2(String original, String test) {
        if(original.length() != test.length()) return false;
        char[] originalAsChars = original.toCharArray();
        StringBuilder stringBuilder = new StringBuilder(test);
        for (char c: originalAsChars
             ) {
            int index = stringBuilder.toString().indexOf(c);
            if(index == - 1)
                return false;
            stringBuilder.deleteCharAt(index);
        }
        return stringBuilder.toString().length() == 0;
    }
}
