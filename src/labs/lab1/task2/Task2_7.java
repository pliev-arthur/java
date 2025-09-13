package labs.lab1.task2;

import java.util.Locale;
import java.util.Scanner;

public class Task2_7 {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public int sum2(int x, int y) {
        int sum = (x + y);
        if ((sum >= 10) && (sum <= 19)) {
            return 20;
        }
        else {
            return sum;
        }
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
        System.out.println(sum2(a, b));
    }
}
