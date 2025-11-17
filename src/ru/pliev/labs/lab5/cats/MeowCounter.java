package ru.pliev.labs.lab5.cats;

public class MeowCounter implements Meowable {
    private Meowable cat;
    private int meowCount;

    public MeowCounter(Meowable cat) {
        this.cat = cat;
        this.meowCount = 0;
    }

    @Override
    public void meow() {
        cat.meow();
        meowCount++;
    }

    public int getMeowCount() {
        return meowCount;
    }
}