package org.chsi.kata.davethomas.weather;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.IntStream;

import static java.nio.file.Files.readAllLines;
import static java.nio.file.Paths.get;

/**
 * Created by chsi on 06/01/2018.
 */
public class WeatherStatistics {

    public int getDayWithSmallestTempSpread() throws Exception {
        SortedMap<Integer, Integer> weatherData;

        Path path = get("src/main/resources/weather.dat");

        final List<String> strings = readFiles(path);

        removeLineToIgnore(strings);

        weatherData = buildWeatherData(strings);

        Integer bestTempSpreadDay = getDayWithGreatestTemperatureSpread(weatherData);

        System.out.println("Day with greated spread of temperature : " + bestTempSpreadDay);

        return bestTempSpreadDay;
    }

    private Integer getDayWithGreatestTemperatureSpread(SortedMap<Integer, Integer> weatherData) {
        return weatherData.entrySet().stream().max((e1, e2) -> e1.getValue() - e2.getValue()).get().getKey();
    }

    private SortedMap<Integer, Integer> buildWeatherData(List<String> strings) {
        final SortedMap<Integer, Integer> weatherData = new TreeMap<>();
        IntStream.range(0, 30).forEach(i -> {
            String[] record = strings.get(i).trim().split("\\s+");
            weatherData.put(Integer.valueOf(record[0]), Integer.valueOf(record[1].substring(0, 2)) - Integer.valueOf(record[2].substring(0, 2)));
        });
        return weatherData;
    }

    private void removeLineToIgnore(List<String> strings) {
        IntStream.range(0, 2).forEach(i -> strings.remove(0));
    }

    private List<String> readFiles(Path path) throws IOException {
        return readAllLines(path);
    }
}
