package ru.pliev.labs.lab4.collectors;

import java.util.*;

public class NumberPartitioner {
    private static final NumberPartitionFactory FACTORY = new NumberPartitionFactory();
    private static final NumberPartitionAdder ADDER = new NumberPartitionAdder();

    public static Map<String, List<Integer>> partitionNumbers(List<Integer> numbers) {
        if (numbers == null) {
            return new HashMap<>();
        }
        return CollectList.collect(numbers, FACTORY, ADDER);
    }
}