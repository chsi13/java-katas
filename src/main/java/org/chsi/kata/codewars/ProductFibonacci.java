package org.chsi.kata.codewars;

public class ProductFibonacci {


    public static long[] productFib(long prod) {
        int a = 0, b = 1;
        while (true) {
            long product = a * b;
            if (product == prod)
                return new long[]{a, b, 1};
            if (product > prod)
                return new long[]{a, b, 0};
            int oldA = a;
            a = b;
            b += oldA;
        }
    }

}
