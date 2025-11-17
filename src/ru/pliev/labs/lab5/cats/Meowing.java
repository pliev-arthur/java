package ru.pliev.labs.lab5.cats;

import java.util.List;

public class Meowing {
    public static void meowing(List<? extends Meowable> meowableList) {
        for (Meowable i : meowableList) {
            i.meow();
        }
    }
}
