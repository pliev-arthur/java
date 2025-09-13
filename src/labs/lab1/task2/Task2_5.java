package labs.lab1.task2;

import java.util.Locale;
import java.util.Scanner;

public class Task2_5 {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public int max3(int x, int y, int z) {
        int max;
        if (x > y) {
            max = x;
        }
        else {
            max = y;
        }
        if (max < z) {
            max = z;
        }
        return max;
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
        System.out.println(max3(a, b, c));
    }
}
