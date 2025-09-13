package labs.lab1.task3;

import java.util.Locale;
import java.util.Scanner;

public class Task3_5 {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public int numLen(long x) {
        int result = 0;
        while (x > 0) {
            x = x / 10;
            result++;
        }
        return result;
    }
    private long properInput() {
        long input;
        System.out.println("Введите целое положительное число: ");
        do {
            while (!scanner.hasNextLong()) {
                System.out.println("Неверный ввод!");
                scanner.next();
            }
            input = scanner.nextLong();
            if (input < 0) {
                System.out.println("Неверный ввод!");
            }
        } while (input < 0);
        return input;
    }
    public void run() {
         long input = properInput();
        System.out.println(numLen(input));
    }
}
