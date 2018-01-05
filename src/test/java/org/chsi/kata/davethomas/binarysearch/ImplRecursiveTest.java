package org.chsi.kata.davethomas.binarysearch;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chsi on 05/01/2018.
 */
public class ImplRecursiveTest {
    @Test
    public void binarySearch() throws Exception {
        ImplRecursive implRecursive = new ImplRecursive();

        assertEquals(7, implRecursive.binarySearch(7, new int[]{0,1,2,3,4,5,6,7,8,9,10}));
        assertEquals(10, implRecursive.binarySearch(10, new int[]{0,1,2,3,4,5,6,7,8,9,10}));
        assertEquals(0, implRecursive.binarySearch(0, new int[]{0,1,2,3,4,5,6,7,8,9,10}));
        assertEquals(-1, implRecursive.binarySearch(11, new int[]{0,1,2,3,4,5,6,7,8,9,10}));
        assertEquals(-1, implRecursive.binarySearch(-1, new int[]{0,1,2,3,4,5,6,7,8,9,10}));
        assertEquals(3, implRecursive.binarySearch(3, new int[]{0,1,2,3,4,5,6,7,8,9,10}));
        assertEquals(11, implRecursive.binarySearch(12, new int[]{0,1,2,3,4,5,6,7,8,9,10,12}));
        assertEquals(11, implRecursive.binarySearch(11, new int[]{0,1,2,3,4,5,6,7,8,9,10,11}));
    }

}