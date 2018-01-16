package org.chsi.kata.davethomas.datamunging;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chsi on 07/01/2018.
 */
public class FootballStatisticsTest {
    @Test
    public void getTeamNameWithSmallestForAndAgainstGoals() throws Exception {
        FootballStatistics footballStatistics = new FootballStatistics();

        assertEquals("Leicester", footballStatistics.getTeamNameWithSmallestForAndAgainstGoals());
    }

}