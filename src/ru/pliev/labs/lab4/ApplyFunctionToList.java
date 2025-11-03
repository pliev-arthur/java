package ru.pliev.labs.lab4;

import ru.pliev.labs.lab4.functions.Function;

import java.util.*;

public class ApplyFunctionToList {
    public static <T, P> List<P> applyFunctionToList(List<T> array, Function<T, P> function) {
        List<P> result = new ArrayList<>();
        if (function == null || array == null) {
            return result;
        }
        for (T element : array) {
            result.add(function.apply(element));
        }
        return result;
    }
}
