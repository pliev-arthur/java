package ru.pliev.main;

import ru.pliev.labs.lab3.birds.Singable;

import java.util.ArrayList;

public class AllCreaturesSinging {
    public void allCreaturesSinging(ArrayList<? extends Singable> creatures) {
        for (Singable i : creatures) {
            i.sing();
        }
    }
}
