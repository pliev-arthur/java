package labs.lab1.task1;

import java.util.Locale;
import java.util.Scanner;

public class Task1_5 {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public boolean is2Digit(int x) {
        return ((x >= 10) && (x <= 99));
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
        System.out.println(is2Digit(input));
    }
}
