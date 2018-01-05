package org.chsi.kata.davethomas.binarysearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chsi on 04/01/2018.
 */
public class ImplIterativeTest {
    @Test
    public void binarySearch() throws Exception {
        ImplIterative implIterative = new ImplIterative();


        assertEquals(7, implIterative.binarySearch(7, new int[]{0,1,2,3,4,5,6,7,8,9,10}));
        assertEquals(10, implIterative.binarySearch(10, new int[]{0,1,2,3,4,5,6,7,8,9,10}));
        assertEquals(0, implIterative.binarySearch(0, new int[]{0,1,2,3,4,5,6,7,8,9,10}));
        assertEquals(-1, implIterative.binarySearch(11, new int[]{0,1,2,3,4,5,6,7,8,9,10}));
        assertEquals(-1, implIterative.binarySearch(-1, new int[]{0,1,2,3,4,5,6,7,8,9,10}));
        assertEquals(3, implIterative.binarySearch(3, new int[]{0,1,2,3,4,5,6,7,8,9,10}));
        assertEquals(11, implIterative.binarySearch(12, new int[]{0,1,2,3,4,5,6,7,8,9,10,12}));
        assertEquals(11, implIterative.binarySearch(11, new int[]{0,1,2,3,4,5,6,7,8,9,10,11}));
    }

}
