package ru.pliev.labs.lab4.combiners;

import java.util.List;

public class IntSumCombiner implements Combiner<Integer> {
    @Override
    public Integer combine(List<Integer> list) {
        if (list == null) {
            return 0;
        }
        Integer result = 0;
        for (Integer i : list) {
            result += i;
        }
        return result;
    }
}
