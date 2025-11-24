package ru.pliev.labs.lab6.task1_1;

import ru.pliev.labs.lab5.cats.Cat;
import ru.pliev.labs.lab6.task1_2.Default;

@Default(String.class)
public class PurringCat extends Cat {

    @Default(String.class)
    private String favouriteFood;

    public PurringCat(String name, String favouriteFood) {
        super(name);
        this.favouriteFood = favouriteFood;
    }
    @Invoke
    public void Purring() {
        System.out.println(super.getName() + ": мур мур мур");
    }


}
