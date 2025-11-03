package ru.pliev.labs.lab4.combiners;

import java.util.List;

public class ArrayCountElementsCombiner implements Combiner <List<Integer>> {
    @Override
    public List<Integer> combine(List<List<Integer>> list) {
        if (list == null) {
            return List.of(0);
        }
        Integer result = 0;
        for (List<Integer> i : list) {
            for (int j = 0; j < i.toArray().length; j++) {
                result += i.get(j);
            }
        }
        return List.of(result);
    }
}
