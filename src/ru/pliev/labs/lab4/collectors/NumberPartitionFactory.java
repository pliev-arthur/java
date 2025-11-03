package ru.pliev.labs.lab4.collectors;

import java.util.*;

public class NumberPartitionFactory implements CollectionFactory<Map<String, List<Integer>>> {
    @Override
    public Map<String, List<Integer>> create() {
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("positive", new ArrayList<>());
        map.put("negative", new ArrayList<>());
        return map;
    }
}