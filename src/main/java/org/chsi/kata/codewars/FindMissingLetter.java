package org.chsi.kata.codewars;

import java.util.*;

/**
 * Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.
 * You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
 * The array will always contain letters in only one case.
 */
public class FindMissingLetter {

    public static char findMissingLetter(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i + 1] != array[i] + 1) {
                return  (char) (array[i] + 1);
            }
        }
        throw new AssertionError("No letter missed - bad input request !");
    }
}
