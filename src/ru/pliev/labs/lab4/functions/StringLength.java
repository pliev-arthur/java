package ru.pliev.labs.lab4.functions;

public class StringLength implements Function<String, Integer> {
    @Override
    public Integer apply(String argument) {
        return argument.length();
    }
}