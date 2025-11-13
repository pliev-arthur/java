package ru.pliev.labs.lab4.collectors;

import java.util.List;

public class UltimateCollector {

    public static <T, R> R collect(List<T> items, AbstractCollector<T, R> collector) {
        if (collector == null) {
            throw new IllegalArgumentException("Коллектор не может быть null");
        }
        return collector.collect(items);
    }
}
