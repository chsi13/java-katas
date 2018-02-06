package org.chsi.kata.crackingthecodingint.stringsandarrays;

import java.util.Collections;
import java.util.Set;

public class Palindrome {


    public boolean isAPalindrome(String test) {
        if(test.length()  == 1)
            return true;

        for(int i = 1; i < test.length(); i++) {
            if(test.charAt(i - 1) != test.charAt(test.length() - i))
                return false;
        }
        return true;
    }


    public boolean canFormAPalindrome (String original) {
        if(original.length() == 1 )
            return true;
        String originalWithoutBlank = original.replace(" ", "");

        boolean isOdd = originalWithoutBlank.length() % 2 != 0;

        if(isOdd) {
            boolean singleCharacterFound = false;
            char singleLetter = Character.MIN_VALUE;
            for(int i = 0; i < originalWithoutBlank.length(); i++) {
               int nbrOfIndexChar = originalWithoutBlank.length() - originalWithoutBlank.replace("" +originalWithoutBlank.charAt(i), "").length();
                   if(nbrOfIndexChar == 1) {
                       if (singleCharacterFound)
                           return false;
                       else
                           singleCharacterFound = true;
                   } else if (nbrOfIndexChar % 2 != 0) {
                       if(singleCharacterFound && singleLetter != originalWithoutBlank.charAt(i))
                           return false;
                       else {
                           singleCharacterFound = true;
                           singleLetter = originalWithoutBlank.charAt(i);
                       }
                   }
            }
        } else {
            for(int i = 0; i < originalWithoutBlank.length(); i++) {
                int nbrOfIndexChar = originalWithoutBlank.length() - originalWithoutBlank.replace("" + originalWithoutBlank.charAt(i), "").length();
                if (nbrOfIndexChar % 2 != 0)
                    return false;
            }
        }
        return true;
    }
}
