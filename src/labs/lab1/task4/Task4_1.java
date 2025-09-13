package labs.lab1.task4;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Task4_1 {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    int n = 7;
    public int findFirstStatic(int[] arr, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    private void fillArrayStatic(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите элемент массива (осталось " + (n - i) + ")");
            arr[i] = properInput();
        }
    }
    public int findFirstDynamic(ArrayList<Integer> arr, int x) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                return i;
            }
        }
        return -1;
    }
    private void fillArrayDynamic(ArrayList<Integer> arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("Введите элемент массива (осталось " + (size - i) + ")");
            arr.add(properInput());
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
    private int properInputUnsigned() {
        int input;
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
        System.out.println("Справка: все числа должны быть целыми, размер массива не может быть отрицательным");
        System.out.println("Введите x: ");
        int x = properInput();
        System.out.println("Выберите: ");
        System.out.println("0 - статический массив на 7 элементов");
        System.out.println("1 - динамический массив размером n");
        while (true) {
            String choice = scanner.next();
            switch (choice) {
                case "0":
                    int[] arrS = new int[n];
                    fillArrayStatic(arrS);
                    System.out.println(findFirstStatic(arrS, x));
                    return;
                case "1":
                    ArrayList<Integer> arrD = new ArrayList<Integer>();
                    System.out.println("Введите размер массива: ");
                    int size = properInputUnsigned();
                    fillArrayDynamic(arrD, size);
                    System.out.println(findFirstDynamic(arrD, x));
                    return;
                default:
                    System.out.println("Неверный ввод! Пожалуйста введите 0 или 1");
            }
        }
    }
}
