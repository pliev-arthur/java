package labs.lab1.task1;

import java.util.Locale;
import java.util.Scanner;

public class Task1_3 {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public int charToNum (char x) {
        return (x - '0');
    }
    private char properInput () {
        String string = "";
        while ((string.length() != 1) || ((string.charAt(0) < '0') || (string.charAt(0) > '9'))) {
            System.out.println("Введите целое число от 0 до 9: ");
            string = scanner.nextLine();
        }
        return string.charAt(0);
    }
    public void run() {
        char input = properInput();
        System.out.println(charToNum(input));
    }

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
