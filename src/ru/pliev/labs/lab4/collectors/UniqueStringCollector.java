package ru.pliev.labs.lab4.collectors;

import java.util.*;

public class UniqueStringCollector extends AbstractCollector<String, Set<String>> {
    private static final UniqueStringFactory FACTORY = new UniqueStringFactory();
    private static final UniqueStringAdder ADDER = new UniqueStringAdder();

    public UniqueStringCollector() {
        super(FACTORY, ADDER);
    }

    public static Set<String> collectUnique(List<String> strings) {
        return new UniqueStringCollector().collect(strings);
    }

    @Override
    protected Set<String> createEmptyResult() {
        return new HashSet<>();
    }
}
