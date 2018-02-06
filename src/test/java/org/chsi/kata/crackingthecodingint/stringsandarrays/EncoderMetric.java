package org.chsi.kata.crackingthecodingint.stringsandarrays;

public class EncoderMetric {

    public static void main(String[] args) {
        for(int i = 0; i< 100000; i++) {
            // warm-up
        }

        long start = System.currentTimeMillis();
        for(int i = 0; i< 1000000; i++) {
            new Encoder().encode2("abcttttyyyppaaaaaammmmmoooollllluuuu");
        }
        long end = System.currentTimeMillis();
        System.out.println("Times : " + (end - start));
    }


    // Conclusion --> Encoder 2 is more performant. Array access better than map.get().
}
