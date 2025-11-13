package ru.pliev.labs.lab4.collectors;

import java.util.*;

public class StringLengthGrouper extends AbstractCollector<String, Map<Integer, List<String>>> {
    private static final StringLengthGroupFactory FACTORY = new StringLengthGroupFactory();
    private static final StringLengthGroupAdder ADDER = new StringLengthGroupAdder();

    public StringLengthGrouper() {
        super(FACTORY, ADDER);
    }

    public static Map<Integer, List<String>> groupByLength(List<String> strings) {
        return new StringLengthGrouper().collect(strings);
    }

    @Override
    protected Map<Integer, List<String>> createEmptyResult() {
        return new HashMap<>();
    }
}