package ru.pliev.labs.lab4.functions;

public class Abs implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer argument) {
        if (argument < 0) {
            return -argument;
        }
        return argument;
    }
}
