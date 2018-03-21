package org.chsi.kata.codewars;

import java.util.*;

public class NextSmallerNumberWithSameDigit {

    public static long nextSmaller(long n) {
        if (n < 20) // fast precondition
            return -1;
        String numberAsString = String.valueOf(n);
        int length = numberAsString.length();
        int pointer = length - 1;
        while (pointer > 0) {
            String substring = numberAsString.substring(pointer-- - 1, numberAsString.length());
            String reorderString = reorder(substring, numberAsString.length());
            if (!substring.equals(reorderString)) {
                return Long.valueOf(numberAsString.substring(0, numberAsString.length() - substring.length()).concat(reorderString));
            }
        }
        return -1;
    }

    private static String reorder(String substring, int totalLength) {
        char firstChar = substring.charAt(0);
        char nextFirst = ' ';
        int indexKeep = 0;
        for (int i = 1; i < substring.length(); i++) {
            if (substring.charAt(i) < firstChar) {
                if (substring.length() == totalLength && substring.charAt(i) == '0') {
                } else {
                    if (nextFirst < substring.charAt(i)) {
                        nextFirst = substring.charAt(i);
                        indexKeep = i;
                    }
                }
            }
        }
        if (nextFirst == ' ')
            return substring;
        else {
            StringBuilder stringBuilder = new StringBuilder(substring);
            stringBuilder.deleteCharAt(indexKeep); // remove previous first letter
            char[] suffixAsArray = stringBuilder.toString().toCharArray();
            Arrays.sort(suffixAsArray); // sort without nextFirst
            String reverse = new StringBuilder(String.valueOf(suffixAsArray)).reverse().toString(); // reverse order
            String result = String.valueOf(nextFirst + reverse);
            return result;
        }
    }
}
