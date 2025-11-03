package ru.pliev.labs.lab4.collectors;

import java.util.*;

public class StringLengthGrouper {
    private static final StringLengthGroupFactory FACTORY = new StringLengthGroupFactory();
    private static final StringLengthGroupAdder ADDER = new StringLengthGroupAdder();

    public static Map<Integer, List<String>> groupByLength(List<String> strings) {
        if (strings == null) {
            return new HashMap<>();
        }
        return CollectList.collect(strings, FACTORY, ADDER);
    }
}
