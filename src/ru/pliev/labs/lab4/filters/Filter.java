package ru.pliev.labs.lab4.filters;

public interface Filter<T> {
    boolean test(T argument);
}

