package org.chsi.kata.crackingthecodingint.stringsandarrays;

/**
 * Check if String contains only one edit action.
 */
public class OnlyOneEdition {


    public boolean onlyOneCharacterHasChanged(String original, String modified) {
        if (!preconditions(original, modified)) return false;

        switch(original.length() - modified.length()) {
            case 0:
                return checkOneToOne(original.toCharArray(), modified.toCharArray()) == 1;
            case 1: //delete char
                int notFoundChar = 0;
                for (int i = 0; i < original.length(); i++) {
                    if (!modified.contains("" + original.charAt(i)))
                        notFoundChar++;
                }
                return notFoundChar == 1;
            case -1:
                for (int i = 0; i < original.length(); i++) {
                    if (!modified.contains("" + original.charAt(i)))
                        return false;
                }
                return true;
            default : throw new IllegalStateException("Impossible state --> precondition hasn't run");
        }
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
