package labs.lab1.task2;

import java.util.Locale;
import java.util.Scanner;

public class Task2_9 {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public String day(int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
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
        System.out.println(day(input));
    }
}
