package labs.lab1.task3;

import java.util.Locale;
import java.util.Scanner;

public class Task3_3 {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public String chet(int x) {
        String result = "";
        for (int i = 0; i <= x; i+=2) {
            result += i + " ";
        }
        return result;
    }
    private int properInput() {
        int input;
        System.out.println("Введите целое положительное число: ");
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Неверный ввод!");
                scanner.next();
            }
            input = scanner.nextInt();
            if (input < 0) {
                System.out.println("Неверный ввод!");
            }
        } while (input < 0);
        return input;
    }
    public void run() {
        int input = properInput();
        System.out.println(chet(input));
    }
}
