package org.chsi.kata.codewars;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Complete the solution so that it strips all text that follows any of a set of comment markers passed in. Any whitespace at the end of the line should also be stripped out.
 * <p>
 * Example:
 * <p>
 * Given an input string of:
 * <p>
 * apples, pears # and bananas
 * grapes
 * bananas !apples
 * The output expected would be:
 * <p>
 * apples, pears
 * grapes
 * bananas
 */
public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        String regex = "[" + Arrays.stream(commentSymbols).collect(Collectors.joining())+ "]+(.)*";
        return Arrays.stream(text.split("\n")).map(s -> {
            return s.replaceAll(regex, "").replaceAll("\\s+$", "");
        }).collect(Collectors.joining("\n"));
    }
}
