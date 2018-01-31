package org.chsi.kata.crackingthecodingint.strings;

public class OnlyOneEdition {


    public boolean onlyOneCharacterHasChanged(String original, String modified) {
        if (!preconditions(original, modified)) return false;

        if(original.length() != modified.length()) {
            // here we check by remove the last
            return checkOneToOne(original.toCharArray(), modified.substring(0, modified.length() - 1).toCharArray()) == 0 ? true : checkOneToOne(original.toCharArray(), modified.substring(1, modified.length()).toCharArray()) == 0;
        }
        // here we check by remove the first
        return checkOneToOne(original.toCharArray(), modified.toCharArray())  == 1;
    }

    public boolean onlyOneCharacterHasChanged2(String original, String modified) {
        if (!preconditions(original, modified)) return false;

        if(original.length() != modified.length()) {
            return modified.contains(original);
        }
        return checkOneToOne(original.toCharArray(), modified.toCharArray()) == 1;
    }

    private boolean preconditions(String original, String modified) {
        if(original.equals(modified))
            return false;

        // precondition if size differs of 2 --> more than one edition
        if(original.length() - modified.length() > 1 ||original.length() - modified.length() < -1)
            return false;

        return true;
    }

    private int checkOneToOne(char[] original, char[] modified) {
        assert original.length == modified.length;
        int edit = 0;
        for(int i = 0; i< original.length; i ++) {
            if(original[i] != modified[i]) {
                edit ++;
            }
        }
        return edit;
    }


}
