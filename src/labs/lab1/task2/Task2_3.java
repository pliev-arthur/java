package labs.lab1.task2;

import java.util.Locale;
import java.util.Scanner;

public class Task2_3 {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public boolean is35(int x) {
        if ((x % 3 == 0) && (x % 5 == 0)) {
            return false;
        }
        else {
            if ((x % 3 == 0) || (x % 5 == 0)) {
                return true;
            } else {
                return false;
            }
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
        System.out.println(is35(input));
    }
}
