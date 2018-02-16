package org.chsi.kata.codewars;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * Your task is to write a function which returns the sum of following series upto nth term(parameter).
 *
 * Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
 *
 * Rules:
 You need to round the answer to 2 decimal places and return it as String.

 If the given value is 0 then it should return 0.00

 You will only be given Natural Numbers as arguments.

 Examples:
 SeriesSum(1) => 1 = "1.00"
 SeriesSum(2) => 1 + 1/4 = "1.25"
 SeriesSum(5) => 1 + 1/4 + 1/7 + 1/10 + 1/13 = "1.57"
 */
public class NthSeries {

    public static String seriesSum(int n) {
        int divider = 1;
        double sum = 1.00d;
        while(n > 1) {
            divider+=3;
            sum += (1d/divider);
            n--;
        }

        // BigDecimal is used for precision.
        BigDecimal bd = new BigDecimal(sum);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.toString();
    }

    public static String seriesSumByStringFormatAndStream(int n) {
        return String.format("%.2f", IntStream.range(1, n + 1).mapToDouble(i -> 1d / (((i-1)* 3) + 1)).sum());
    }
}
