package org.chsi.kata.crackingthecodingint.stringsandarrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZeroMatrixTest {

    @Test
    public void isValid() {
        int[][] matrixUnderTest = new int [3][3];

        matrixUnderTest[0] = new int[] {1,2,3};
        matrixUnderTest[1] = new int[] {0,0,0};
        matrixUnderTest[2] = new int[] {0,0,0};

        assertTrue(new ZeroMatrix().isValid(matrixUnderTest));
    }

    @Test
    public void isNotValid() {
        int[][] matrixUnderTest = new int [3][3];

        matrixUnderTest[0] = new int[] {1,2,3};
        matrixUnderTest[1] = new int[] {4,5,0};
        matrixUnderTest[2] = new int[] {0,0,1};

        assertFalse(new ZeroMatrix().isValid(matrixUnderTest));
    }
}