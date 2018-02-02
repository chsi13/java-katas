package org.chsi.kata.crackingthecodingint.stringsandarrays;

public class Palindrome {


    public boolean isAPalindrome(String test) {
        if(test.length()  == 1) {
            return true;
        }

        for(int i = 1; i < test.length(); i++) {
            if(test.charAt(i - 1) != test.charAt(test.length() - i))
                return false;
        }
        return true;
    }
}
