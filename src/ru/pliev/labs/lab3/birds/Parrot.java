package ru.pliev.labs.lab3.birds;

import java.util.Random;

public class Parrot extends Bird {
    public Parrot(String text) {
        super.sound = text;
    }
    public void setText(String text) {
        super.sound = text;
    }
    public String getText() {
        return sound;
    }
    @Override
    public void sing() {
        int min = 1, max = sound.length();
        Random random = new Random();
        int countFirstLetters = random.nextInt((max - min + 1) + min);
        System.out.println((sound + " ").substring(0, countFirstLetters));
    }
    @Override
    public String toString() {
        return "Вид птицы: Попугай; Говорит случайное число первых символов текста: " + sound;
    }
}
