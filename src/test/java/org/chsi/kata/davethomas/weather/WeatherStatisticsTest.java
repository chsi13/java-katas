package org.chsi.kata.davethomas.weather;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chsi on 06/01/2018.
 */
public class WeatherStatisticsTest {

    @Test
    public void getSmallestTempSpread() throws Exception {
        WeatherStatistics weatherStatistics = new WeatherStatistics();

        assertEquals(9 ,weatherStatistics.getDayWithSmallestTempSpread());

    }
}
