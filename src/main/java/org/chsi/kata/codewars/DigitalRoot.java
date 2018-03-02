package org.chsi.kata.codewars;

import java.util.Arrays;

public class DigitalRoot {

    public static int digital_root(int n) {
        if (n < 10)
            return n;
        return digital_root(Arrays.stream(String.valueOf(n).split("(?=\\d)")).mapToInt(s -> Integer.parseInt(s)).sum());
    }
}
