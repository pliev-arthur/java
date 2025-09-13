package labs.lab1.task1;

import java.util.Locale;
import java.util.Scanner;

public class Task1_9 {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public boolean isEqual (int a, int b, int c) {
        return (a == b) && (b == c);
    }
    private int properInput() {
        int input;
        while (!scanner.hasNextInt()) {
            System.out.println("Неверный ввод!");
            scanner.next();
        }
        input = scanner.nextInt();
        return input;
    }
    public void run() {
        System.out.println("Справка: Все числа должны быть целыми!");
        System.out.println("Введите первое число: ");
        int a = properInput();
        System.out.println("Введите второе число: ");
        int b = properInput();
        System.out.println("Введите третье число: ");
        int c = properInput();
        System.out.println(isEqual (a, b, c));
    }
}
