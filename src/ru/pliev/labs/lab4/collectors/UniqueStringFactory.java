package ru.pliev.labs.lab4.collectors;

import java.util.*;

public class UniqueStringFactory implements CollectionFactory<Set<String>> {
    @Override
    public Set<String> create() {
        return new HashSet<>();
    }
}
