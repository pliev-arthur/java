package labs.lab1.task1;

import java.util.Locale;
import java.util.Scanner;


public class Task1_7 {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public boolean isInRange (int a, int b, int num) {
        if (a >= b) {
            return ((num >= b) && (num <= a));
        }
        else {
            return ((num >= a) && (num <= b));
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
        System.out.println("Введите первую границу диапазона: ");
        int a = properInput();
        System.out.println("Введите вторую границу диапазона: ");
        int b = properInput();
        System.out.println("Введите число: ");
        int num = properInput();
        System.out.println(isInRange (a, b, num));
    }
}
