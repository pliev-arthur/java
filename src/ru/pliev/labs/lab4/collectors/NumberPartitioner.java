package ru.pliev.labs.lab4.collectors;

import java.util.*;

public class NumberPartitioner extends AbstractCollector<Integer, Map<String, List<Integer>>> {
    private static final NumberPartitionFactory FACTORY = new NumberPartitionFactory();
    private static final NumberPartitionAdder ADDER = new NumberPartitionAdder();

    public NumberPartitioner() {
        super(FACTORY, ADDER);
    }

    public static Map<String, List<Integer>> partitionNumbers(List<Integer> numbers) {
        return new NumberPartitioner().collect(numbers);
    }

    @Override
    protected Map<String, List<Integer>> createEmptyResult() {
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("positive", new ArrayList<>());
        map.put("negative", new ArrayList<>());
        return map;
    }
}