package labs.lab1.task2;

import java.util.Locale;
import java.util.Scanner;

public class Task2_1 {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public int abs(int x) {
        if (x < 0) {
            return -x;
        }
        else {
            return x;
        }
    }
    private int properInput() {
        int input;
        System.out.println("Введите целое число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Неверный ввод!");
            scanner.next();
        }
        input = scanner.nextInt();
        return input;
    }
    public void run() {
        int input = properInput();
        System.out.println(abs(input));
    }
}
