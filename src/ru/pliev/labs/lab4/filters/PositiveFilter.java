package ru.pliev.labs.lab4.filters;

public class PositiveFilter implements Filter<Integer> {
    @Override
    public boolean test(Integer argument) {
        return (argument >= 0);
    }
}
