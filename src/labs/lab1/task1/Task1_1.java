package labs.lab1.task1;

import java.util.Locale;
import java.util.Scanner;

public class Task1_1 {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public double fraction (double x) {
        return x % 1;
    }
    private double inputDouble () {
        double input;
        System.out.println("Введите дробное число: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Это не дробное число!");
            scanner.next();
        }
        input = scanner.nextDouble();
        return input;
    }
    public void run() {
        double input = inputDouble();
        System.out.printf(Locale.US,"%.3f%n",fraction(input));
    }
}
