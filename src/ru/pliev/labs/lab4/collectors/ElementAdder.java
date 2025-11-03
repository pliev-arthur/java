package ru.pliev.labs.lab4.collectors;

public interface ElementAdder<T, P> {
    void add(P collection, T element);
}
