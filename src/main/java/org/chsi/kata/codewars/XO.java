package org.chsi.kata.codewars;

/**
 * Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
 */
public class XO {
    public static boolean getXO (String str) {
        return str.replaceAll("(?i)o", "").length() == str.replaceAll("(?i)x", "").length();
    }
}
