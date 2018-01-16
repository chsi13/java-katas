package org.chsi.kata.davethomas.datamunging;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;

import static java.nio.file.Files.readAllLines;
import static java.nio.file.Paths.get;

/**
 * Created by chsi on 06/01/2018.
 */
public class WeatherStatistics extends DataStatistics<Integer, Integer> {

    public WeatherStatistics() throws IOException {
        super(Paths.get("src/main/resources/weather.dat"), Integer.class, Integer.class, new int[]{0,1,31});
    }

    public int getDayWithSmallestTemperatureSpread() throws Exception {
        return data.entrySet().stream().max((e1, e2) -> e2.getValue() - e1.getValue()).get().getKey();
    }

    public int getDayWithGreatestTemperatureSpread() {
        return data.entrySet().stream().max((e1, e2) -> e1.getValue() - e2.getValue()).get().getKey();
    }

    @Override
    protected Map.Entry<Integer, Integer> getDataFromRecord(String[] record) {
        return Map.entry(Integer.valueOf(record[0]),
                      Integer.valueOf(record[1].substring(0, 2)) - Integer.valueOf(record[2].substring(0, 2)));
    }


}
