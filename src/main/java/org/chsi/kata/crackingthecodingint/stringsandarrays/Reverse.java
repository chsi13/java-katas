package org.chsi.kata.crackingthecodingint.stringsandarrays;

public class Reverse {

    public boolean isReverse(String original, String test) {
        if (original.length() != test.length()) return false;
        for (int i = 0, j = original.length() - 1; i < original.length() && j >= 0; i++, j--) {
            if (original.charAt(i) != test.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
