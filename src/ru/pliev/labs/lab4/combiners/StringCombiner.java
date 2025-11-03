package ru.pliev.labs.lab4.combiners;

import java.util.List;

public class StringCombiner implements Combiner<String> {
    @Override
    public String combine(List<String> list) {
        if (list == null) {
            return "";
        }
        String result = "";
        for (String i : list) {
            result += i;
        }
        return result;
    }
}
