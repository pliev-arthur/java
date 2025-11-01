package ru.pliev.labs.lab4.filters;

import java.util.List;

public class PositiveArrayFilter implements Filter<List<Integer>>{
    @Override
    public boolean test(List<Integer> argument) {
        for (int i : argument) {
            if (i < 0) {
                return false;
            }
        }
        return true;
    }
}
