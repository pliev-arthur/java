package ru.pliev.labs.lab3.birds;

public class Sparrow extends Bird {
    public Sparrow() {
        super.sound = "чырык";
    }

    public String getSound() {
        return sound;
    }

    @Override
    public void sing() {
        System.out.println(sound);
    }

    @Override
    public String toString() {
        return "Вид птицы: Воробей; Издает звук: " + sound;
    }
}
