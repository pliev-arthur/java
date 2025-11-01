package ru.pliev.labs.lab4.functionsToList;

import ru.pliev.labs.lab4.functions.Function;

import java.util.ArrayList;

public class ApplyFunctionToList<P,T> {
    public ArrayList<P> applyFunctionToArray(ArrayList<T> array, Function<P, T> function) {
        ArrayList<P> result = new ArrayList<>();
        for (T element : array) {
            result.add(function.apply(element));
        }
        return result;
    }
}
