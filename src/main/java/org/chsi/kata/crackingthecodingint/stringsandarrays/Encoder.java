package org.chsi.kata.crackingthecodingint.stringsandarrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Implementation of simple String compression.
 *
 * using count of repeated characters.
 *
 * Ex. aabcc -> a2b1c2
 *
 * if compressed string is greater than original, return the original
 */
public class Encoder {

    public String encode(String toEncode) {
        Set<Character> distinctCharsInString = new LinkedHashSet<>();
        Map<Character, Integer> map = new HashMap<>();

        for(char ch = 'a'; ch <= 'z'; ch++)
            map.put(ch, 0);

        for(int i = 0; i < toEncode.length(); i++) {
            char c = toEncode.charAt(i);
            map.put(c, map.get(c) + 1);
            distinctCharsInString.add(c);
        }

        StringBuilder encodedTextBuilder = new StringBuilder();
        for(Character c : distinctCharsInString) {
            encodedTextBuilder.append("" + c + map.get(c));
        }
        String encodedText =  encodedTextBuilder.toString();

        return encodedText.length() <= toEncode.length() ? encodedText : toEncode;
    }

    public String encode2(String toEncode) {
        Set<Character> distinctCharsInString = new LinkedHashSet<>();
        int[] letterCounter = new int[128];

        for(int i = 0; i < toEncode.length(); i++) {
            char c = toEncode.charAt(i);
            letterCounter[c]= letterCounter[c] + 1;
            distinctCharsInString.add(c);
        }

        StringBuilder encodedTextBuilder = new StringBuilder();
        for(Character c : distinctCharsInString) {
            encodedTextBuilder.append("" + c + letterCounter[c]);
        }
        String encodedText =  encodedTextBuilder.toString();

        return encodedText.length() <= toEncode.length() ? encodedText : toEncode;
    }
}
