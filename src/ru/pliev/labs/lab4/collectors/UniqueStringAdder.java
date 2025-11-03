package ru.pliev.labs.lab4.collectors;

import java.util.*;

public class UniqueStringAdder implements ElementAdder<String, Set<String>> {
    @Override
    public void add(Set<String> set, String str) {
        set.add(str);
    }
}