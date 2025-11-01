package ru.pliev.labs.lab4.functions;

public class StringLength implements Function<Integer, String> {
    @Override
    public Integer apply(String argument) {
        return argument.length();
    }
}
