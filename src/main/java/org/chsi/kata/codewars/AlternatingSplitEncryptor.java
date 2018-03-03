package org.chsi.kata.codewars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlternatingSplitEncryptor {

    public static String encryptByIterativeNestedLoop(final String text, final int n) {
        if(n == 0 || text == null || text.trim().length() == 0)
            return text;

        String encryptedText = text;
        StringBuilder encryptedTextPart1Builder = null, encryptedTextPart2Builder = null;
        boolean textLengthIsEven= text.length() % 2 == 0;
        for(int loop = 0; loop < n; loop ++) {
            encryptedTextPart1Builder = new StringBuilder();
            encryptedTextPart2Builder = new StringBuilder();
            for(int index = 1; index < encryptedText.length(); index+=2) {
                encryptedTextPart1Builder.append(encryptedText.charAt(index));
                encryptedTextPart2Builder.append(encryptedText.charAt(index - 1));
            }
            if(!textLengthIsEven)
                encryptedTextPart2Builder.append(encryptedText.charAt(encryptedText.length() - 1));

            encryptedText = encryptedTextPart1Builder.append(encryptedTextPart2Builder.toString()).toString();
        }
        return encryptedText;
    }

    public static String encryptRecursive(final String text, final int n) {
        if(n <= 0 || text == null || text.trim().length() == 0)
            return text;
        String encryptedText = text;
        StringBuilder encryptedTextPart1Builder = new StringBuilder(), encryptedTextPart2Builder = new StringBuilder();
        boolean textLengthIsEven= text.length() % 2 == 0;
        for(int index = 1; index < encryptedText.length(); index+=2) {
            encryptedTextPart1Builder.append(encryptedText.charAt(index));
            encryptedTextPart2Builder.append(encryptedText.charAt(index - 1));
        }
        if(!textLengthIsEven)
            encryptedTextPart2Builder.append(encryptedText.charAt(encryptedText.length() - 1));

        return encryptRecursive(encryptedTextPart1Builder.append(encryptedTextPart2Builder.toString()).toString(), n - 1);
    }

    public static String encryptRecursiveWithStream(final String text, final int n) {
        if(n <= 0 || text == null || text.trim().length() == 0)
            return text;

        String part2 =  IntStream.iterate(0, i -> ++i)
                                 .limit(text.length())
                                 .filter(i -> i % 2 == 0)
                                 .mapToObj(i -> String.valueOf(text.charAt(i)))
                                 .collect(Collectors.joining());

        String part1 = IntStream.iterate(0, i -> ++i)
                                .limit(text.length())
                                .filter(i -> i % 2 != 0)
                                .mapToObj(i -> String.valueOf(text.charAt(i)))
                                .collect(Collectors.joining());

        return encryptRecursiveWithStream(part1.concat(part2), n - 1);
    }



    public static String decrypt(final String encryptedText, final int n) {
        if(n <= 0 || encryptedText == null || encryptedText.trim().length() == 0)
            return encryptedText;
        StringBuilder builder = new StringBuilder();
        for(int i= 0; i < (encryptedText.length() / 2); i++) {
            builder.append(encryptedText.charAt(encryptedText.length() / 2 + i)).append(encryptedText.charAt(i));
        }
        if(encryptedText.length() % 2 > 0 )
            builder.append(encryptedText.charAt(encryptedText.length() - 1));
        return decrypt(builder.toString(), n - 1);
    }
}
