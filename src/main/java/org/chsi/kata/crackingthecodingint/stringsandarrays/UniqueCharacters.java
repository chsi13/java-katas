package org.chsi.kata.crackingthecodingint.stringsandarrays;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueCharacters {

    // Supposition --> text not null && no blank

    private boolean precondition(String text) {
        return text.length() <= 128 &&  text.length() > 1;
    }

    public boolean containsUniqueCharacters(String text) {
        if(! precondition(text)) return false;

        // Usage contains function from List type to check if char already exists.

        char[] chars = text.toCharArray();
        ArrayList listOfChars = new ArrayList<>();
        for(char c : chars) {
            if(listOfChars.contains(c))
                return false;
            else
                listOfChars.add(c);
        }
        return true;
    }

    public boolean containsUniqueCharacters2(String text) {
       if(! precondition(text)) return false;

        Set<Character> set = new HashSet<>(text.chars().mapToObj(c -> ((char) c)).collect(Collectors.toSet()));
        if(text.length() == set.size())
            return true;
        return false;
    }

    public boolean containsUniqueCharacters3(String text) {
        // implementation without data structures usage.
        // Order then check neighbour

        if(! precondition(text)) return false;

        char[] chars = text.toCharArray();
        for(int i = 0; i < chars.length - 1 ; i++) {
            for(int j = i + 1; j < chars.length; j++) {
                if(chars[i] > chars[j]) {
                    char temp = chars[j];
                    chars[j] = chars[i];
                    chars[i] = temp;
                }
            }
        }

        for(int i = 0; i< chars.length - 1; i ++) {
            if(chars[i] == chars[i + 1])
                return false;
        }
        return true;
    }

    public boolean containsUniqueCharacters4(String text) {
        // boolean switch based on char index.
       if(! precondition(text)) return false;
       boolean[] bools = new boolean[128];
       char[] chars = text.toCharArray();
       for(int i = 0; i < chars.length; i ++){
            if(bools[chars[i]])
                return false;
            else
                bools[chars[i]] = true;
       }
       return true;
    }

}
