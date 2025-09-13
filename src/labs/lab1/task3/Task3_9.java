package labs.lab1.task3;

import java.util.Locale;
import java.util.Scanner;

public class Task3_9 {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = x; j > 0; j--) {
                if (j > i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
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
        rightTriangle(input);
    }
}
