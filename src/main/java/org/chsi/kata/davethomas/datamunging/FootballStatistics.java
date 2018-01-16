package org.chsi.kata.davethomas.datamunging;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.IntStream;

import static java.nio.file.Files.readAllLines;

/**
 * Created by chsi on 07/01/2018.
 */
public class FootballStatistics extends DataStatistics<String, Integer> {

    private SortedMap<String, Integer> footballData;

    public FootballStatistics() throws IOException {
        super(Paths.get("src/main/resources/football.dat"), String.class, Integer.class, new int[]{0, 18});
    }

    public String getTeamNameWithSmallestForAndAgainstGoals() throws Exception {
        return data.entrySet().stream().max((e1, e2) -> e2.getValue() - e1.getValue()).get().getKey();
    }

    @Override
    protected Map.Entry<String, Integer> getDataFromRecord(String[] record) {
        return Map.entry(record[1], Integer.valueOf(record[6]) - Integer.valueOf(record[8]));
    }
}
