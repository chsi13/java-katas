package org.chsi.kata.crackingthecodingint.stringsandarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Urlify {


    public char[] encode(char[] content ) {

        int newSize = content.length;

        for(int i = 0; i < content.length; i++) {
            if(content[i] == ' ')
                newSize += 2;
        }

        if(newSize == content.length)
            return content;

        char[] updateContent = new char[newSize];

        for(int i = 0, j = 0; i < content.length; i++, j++) {
            if(content[i] == ' ') {
                updateContent[j] = '%'; updateContent[++j] = '2'; updateContent[++j] = '0';
            } else {
                updateContent[j] = content[i];
            }
        }
        return updateContent;
    }

}
