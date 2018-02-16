package org.chsi.kata.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class NthSeriesTest {

    @Test
    public void seriesSum() {
        assertEquals(NthSeries.seriesSum(5), "1.57");
        assertEquals(NthSeries.seriesSumByStringFormatAndStream(5), "1.57");
    }
}