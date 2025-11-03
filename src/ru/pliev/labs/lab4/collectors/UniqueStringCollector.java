package ru.pliev.labs.lab4.collectors;

import java.util.*;

public class UniqueStringCollector {
    private static final UniqueStringFactory FACTORY = new UniqueStringFactory();
    private static final UniqueStringAdder ADDER = new UniqueStringAdder();

    public static Set<String> collectUnique(List<String> strings) {
        if (strings == null) {
            return new HashSet<>();
        }
        return CollectList.collect(strings, FACTORY, ADDER);
    }
}
