package org.chsi.kata.codewars;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * As the name may already reveal, it works basically like a Fibonacci, but summing the last 3 (instead of 2) numbers of the sequence to generate the next. And, worse part of it, regrettably I won't get to hear non-native Italian speakers trying to pronounce it :(
 */
public class Xbonacci {

    private static final double[] EMPTY_ARRAY = new double[0];

    public double[] tribonacci(double[] s, int n) {
        if(n == 0)
            return EMPTY_ARRAY;

        double[] result = Arrays.copyOf(s, n);
        for(int i = 3; i< n; i++) {
            result[i] = result[i - 1] + result[ i - 2] + result[i - 3];
        }
        return result;
    }

    public double[] tribonacciWithStream(double[] s, int n) {
        double[] result = Arrays.copyOf(s, n);
        IntStream.range(0, n).forEach(index -> result[index + 3] = result[(3 + (1* index)) - index - 1] + result[(3 + (1* index)) - index - 2] + result[(3 + (1* index)) - index - 3]);
        return result;
    }
}
