package ru.pliev.labs.lab4.functions;


public interface Function<T,P> {
    P apply(T argument);
}
