package org.chsi.kata.davethomas.binarysearch;

/**
 * Created by chsi on 04/01/2018.
 */
public class ImplRecursive {

    public int binarySearch(int value, int[] array) {
        return binarySearchRecur(value, array, 0, array.length - 1);
    }

    int binarySearchRecur(int value, int[] array, int low, int high) {
        if(low > high) return -1;

        int medium = ((high + low) / 2);

        if(array[medium] == value)
            return medium;
        if(value < array[medium])
            return binarySearchRecur(value, array, low, medium - 1);
        else
            return binarySearchRecur(value, array, medium + 1, high);

    }
}
