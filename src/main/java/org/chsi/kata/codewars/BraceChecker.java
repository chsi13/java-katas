package org.chsi.kata.codewars;

public class BraceChecker {

    public static boolean isValid(String content) {
        if (content.length() % 2 == 1) // fast exit precondition
            return false;

        char[] braces = content.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int openCounter = 0;
        for (char brace : braces) {
            if (isOpenBrace(brace)) {
                openCounter++;
                stringBuilder.append(brace);
            } else {
                if (openCounter == 0)
                    return false;
                if (brace != getCorrespondingOpenBrace(stringBuilder.charAt(stringBuilder.length() - 1))) {
                    return false;
                }
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                openCounter--;
            }
        }
        return openCounter == 0;
    }

    private static char getCorrespondingOpenBrace(char c) {
        switch(c) {
            case '{' : return '}';
            case '(' : return ')';
            case '[' : return ']';
            default: throw new IllegalArgumentException("Not supported character:" + c);
        }
    }

    private static boolean isOpenBrace(char brace) {
        return brace == '{' || brace == '[' || brace == '(';
    }
}
