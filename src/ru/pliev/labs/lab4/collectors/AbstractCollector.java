package ru.pliev.labs.lab4.collectors;

import java.util.*;

public abstract class AbstractCollector<T, R> {
    private final CollectionFactory<R> factory;
    private final ElementAdder<T, R> adder;

    protected AbstractCollector(CollectionFactory<R> factory, ElementAdder<T, R> adder) {
        this.factory = factory;
        this.adder = adder;
    }

    public R collect(List<T> items) {
        if (items == null) {
            return createEmptyResult();
        }
        return CollectList.collect(items, factory, adder);
    }

    protected abstract R createEmptyResult();
}