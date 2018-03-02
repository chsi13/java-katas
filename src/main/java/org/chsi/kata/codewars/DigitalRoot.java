package org.chsi.kata.codewars;

import java.util.Arrays;
/**
A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n. If that value has two digits, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.
**/
public class DigitalRoot {

    public static int digital_root(int n) {
        if (n < 10)
            return n;
        return digital_root(Arrays.stream(String.valueOf(n).split("(?=\\d)")).mapToInt(s -> Integer.parseInt(s)).sum());
    }
}
