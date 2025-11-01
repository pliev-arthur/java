package ru.pliev.labs.lab4.filters;

public class LengthFilter implements Filter<String>{
    @Override
    public boolean test(String argument) {
        return (argument.length() >= 3);
    }
}
