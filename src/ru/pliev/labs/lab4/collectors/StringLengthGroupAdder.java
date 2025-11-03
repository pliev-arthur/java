package ru.pliev.labs.lab4.collectors;

import java.util.*;

public class StringLengthGroupAdder implements ElementAdder<String, Map<Integer, List<String>>> {
    @Override
    public void add(Map<Integer, List<String>> map, String str) {
        int length = str.length();

        if (!map.containsKey(length)) {
            map.put(length, new ArrayList<>());
        }

        map.get(length).add(str);
    }
}
