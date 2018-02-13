package org.chsi.kata.davethomas.binarysearch;

/**
 * Created by chsi on 04/01/2018.
 * Iterative implementation of a Binary Search.
 */
public class ImplIterative {

    public int binarySearch(int value, int[] array) {
        int low = 0;
        int high = array.length - 1;

        while(low <= high) {
            int medium = ((high + low) / 2);

            if(array[medium] == value)
                return medium;
            if(value < array[medium])
                high = medium - 1;
            else
                low = medium + 1;
        }
        return -1;
    }
}
