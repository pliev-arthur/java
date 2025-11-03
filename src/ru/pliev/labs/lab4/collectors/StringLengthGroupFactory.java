package ru.pliev.labs.lab4.collectors;

import java.util.*;

public class StringLengthGroupFactory implements CollectionFactory<Map<Integer, List<String>>> {
    @Override
    public Map<Integer, List<String>> create() {
        return new HashMap<>();
    }
}

