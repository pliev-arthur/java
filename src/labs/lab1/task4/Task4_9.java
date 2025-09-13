package labs.lab1.task4;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Task4_9 {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    int n = 7;
    public int[] findAllStatic(int[] arr, int x) {
        int cntIndX = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                cntIndX++;
            }
        }
        int[] arrRes = new int[cntIndX];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                arrRes[j] = i;
                j++;
            }
        }
        return arrRes;
    }
    private void fillArrayStatic(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите элемент массива (осталось " + (n - i) + ")");
            arr[i] = properInput();
        }
    }
    private void printArrayStatic(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Массив пуст!");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length-1]);
        System.out.println("]");
    }
    public ArrayList<Integer> findAllDynamic(ArrayList<Integer> arr, int x) {
        ArrayList<Integer> arrRes = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                arrRes.add(i);
            }
        }
        return arrRes;
    }
    private void fillArrayDynamic(ArrayList<Integer> arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("Введите элемент массива (осталось " + (size - i) + ")");
            arr.add(properInput());
        }
    }
    private void printArrayDynamic(ArrayList<Integer> arr) {
        if (arr.isEmpty()) {
            System.out.println("Массив пуст!");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.size()-1; i++) {
            System.out.print(arr.get(i) + ", ");
        }
        System.out.print(arr.getLast());
        System.out.println("]");
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
        System.out.println("Выберите: ");
        System.out.println("0 - статический массив на 7 элементов");
        System.out.println("1 - динамический массив размером n");
        while (true) {
            String choice = scanner.next();
            switch (choice) {
                case "0":
                    int[] arrS1 = new int[n];
                    fillArrayStatic(arrS1);
                    printArrayStatic(arrS1);
                    System.out.println("Введите x: ");
                    int x1 = properInput();
                    printArrayStatic(findAllStatic(arrS1, x1));
                    return;
                case "1":
                    ArrayList<Integer> arrD1 = new ArrayList<Integer>();
                    System.out.println("Введите размер массива: ");
                    int size1 = properInputUnsigned();
                    fillArrayDynamic(arrD1, size1);
                    printArrayDynamic(arrD1);
                    System.out.println("Введите x: ");
                    int x2 = properInput();
                    printArrayDynamic(findAllDynamic(arrD1, x2));
                    return;
                default:
                    System.out.println("Неверный ввод! Пожалуйста введите 0 или 1");
            }
        }
    }
}
