package org.chsi.kata.codewars;


public class NextSmallerNumberWithSameDigit {
    public static long nextSmaller(long n) {
        if (n < 20)
            return -1;
        String numberAsString = String.valueOf(n);
        int iteration = numberAsString.length();
        while (iteration > 0) {
            int startPointer = numberAsString.length() - 1;
            while (startPointer > 0) {
                char[] toChars = numberAsString.toCharArray();
                char tmp = toChars[startPointer];
                toChars[startPointer] = toChars[startPointer - 1];
                toChars[startPointer - 1] = tmp;
                long permutValue = Long.valueOf(String.valueOf(toChars));
                if (permutValue < n && !String.valueOf(toChars).startsWith("0"))
                    return permutValue;
                startPointer--;
                numberAsString = String.valueOf(toChars);
            }
            iteration--;
        }
        return -1;
    }
}