package ru.pliev.labs.lab4.combiners;

import java.util.*;

public interface Combiner<T> {
    T combine(List<T> list);
}
