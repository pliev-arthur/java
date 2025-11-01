package ru.pliev.labs.lab4.functions;


public interface Function<P,T> {
    P apply(T argument);
}
