package ru.pliev.labs.lab4;

import ru.pliev.labs.lab4.filters.Filter;

import java.util.ArrayList;
import java.util.List;

public class FilteringList {
    public static <T> List<T> filteringList(List<T> array, Filter<T> filter) {
        List<T> result = new ArrayList<>();
        for (T element : array) {
            if (filter.test(element)) {
                result.add(element);
            }
        }
        return result;
    }
}
