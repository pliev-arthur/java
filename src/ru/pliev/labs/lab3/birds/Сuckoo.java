package ru.pliev.labs.lab3.birds;

import java.util.Random;

public class Сuckoo extends Bird {
    public Сuckoo() {
        super.sound = "ку-ку";
    }
    public String getSound() {
        return sound;
    }
    @Override
    public void sing() {
        int min = 1, max = 10;
        Random random = new Random();
        int countCucu = random.nextInt((max - min + 1) + min);
        System.out.println((sound + " ").repeat(countCucu));
    }
    @Override
    public String toString() {
        return "Вид птицы: Кукушка; Издает случайное число раз от 1 до 10 звук: " + sound;
    }
}
