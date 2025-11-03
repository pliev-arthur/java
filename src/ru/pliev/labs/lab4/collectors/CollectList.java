package ru.pliev.labs.lab4.collectors;

import java.util.List;

public class CollectList {
    public static <T, P> P collect(List<T> sourceList,
                                   CollectionFactory<P> collectionFactory,
                                   ElementAdder<T, P> elementAdder) {
        if (sourceList == null) {
            throw new RuntimeException("Исходный список null");
        }
        P result = collectionFactory.create();
        for (T element : sourceList) {
            elementAdder.add(result, element);
        }
        return result;
    }
}
