package ru.pliev.labs.lab4.collectors;

import java.util.*;

public class NumberPartitionAdder implements ElementAdder<Integer, Map<String, List<Integer>>> {
    @Override
    public void add(Map<String, List<Integer>> map, Integer number) {
        if (number > 0) {
            map.get("positive").add(number);
        } else if (number < 0) {
            map.get("negative").add(number);
        }
    }
}