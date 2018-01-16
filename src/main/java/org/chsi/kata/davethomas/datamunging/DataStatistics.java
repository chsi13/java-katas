package org.chsi.kata.davethomas.datamunging;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Function;
import java.util.stream.IntStream;

/**
 * Created by chsi on 07/01/2018.
 */
public abstract class DataStatistics<K,V> {

    protected SortedMap<K,V> data;

    private List<String> allLines;

    public DataStatistics(Path path, Class<K> typeK, Class<V> typeV, int[] ignoreLines) throws IOException {
        data = new TreeMap<>();
        allLines = Files.readAllLines(path);
        Arrays.stream(ignoreLines).forEach(index ->
        {if(index == 0)
            allLines.remove(index);
        else
            allLines.remove(index - 1);});
        buildData();
    }

    public void buildData() {
        IntStream.range(0, allLines.size()).forEach(i -> {
            String[] record = allLines.get(i).trim().split("\\s+");
            Map.Entry<K,V> entry = getDataFromRecord(record);
            data.put(entry.getKey(), entry.getValue());
        });
    }

    protected abstract Map.Entry<K,V> getDataFromRecord(String[] record);

}
