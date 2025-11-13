package ru.pliev.labs.lab5;

import java.util.Locale;
import java.util.Scanner;

public class Lab5 {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public void run() {
        String input;
        System.out.println("Справка:");
        System.out.println("Формат ввода задач - задание.задача");
        System.out.println("0 - выход");
        while (true) {
            System.out.println("Введите номер задачи: ");
            input = scanner.nextLine().trim();
            switch (input) {
                case "0":
                    return;
                case "1.1":
                    runTask1_1();
                    break;
                default:
                    System.out.println("Такой задачи нет!");
                    break;
            }
        }
    }

    public void runTask1_1() {

    }
}
