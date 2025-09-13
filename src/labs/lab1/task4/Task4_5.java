package labs.lab1.task4;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Task4_5 {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    int n = 7;
    public int[] addStatic(int[] arr1, int[] arr2, int pos) {
       int arrRes[] = new int[n+n];
       int k = 0;
       for (int i = 0; i < n+n; i++) {
           if (i == pos) {
               for (int j = 0; j < n; j++) {
                   arrRes[i] = arr2[j];
                   i++;
               }
           }
           if (k < n) {
               arrRes[i] = arr1[k];
               k++;
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
    public ArrayList<Integer> addDynamic(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int pos) {
        ArrayList<Integer> arrRes = new ArrayList<Integer>();
        int k = 0;
        for (int i = 0; i < arr1.size() + arr2.size(); i++) {
            if (i == pos) {
                for (int j = 0; j < arr2.size(); j++) {
                    arrRes.add(arr2.get(j));
                    i++;
                }
            }
            if (k < arr1.size()) {
                arrRes.add(arr1.get(k));
                k++;
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
    private int inputPos(int arrSize) {
        int input;
        do {
            input = properInputUnsigned();
            if (input > arrSize) {
                System.out.println("Неверный ввод!");
            }
        } while (input > arrSize);
        return input;
    }
    public void run() {
        System.out.println("Справка: все числа должны быть целыми, размер массива не может быть отрицательным");
        System.out.println("Выберите: ");
        System.out.println("0 - статические массивы на 7 элементов");
        System.out.println("1 - динамические массивы размером n");
        while (true) {
            String choice = scanner.next();
            switch (choice) {
                case "0":
                    int[] arrS1 = new int[n];
                    int[] arrS2 = new int[n];
                    System.out.println("Заполнение первого массива: ");
                    fillArrayStatic(arrS1);
                    printArrayStatic(arrS1);
                    System.out.println("Заполнение второго массива: ");
                    fillArrayStatic(arrS2);
                    printArrayStatic(arrS2);
                    System.out.println("Введите позицию (индекс считать с 0, не может быть отрицательным или больше длины первого массива): ");
                    int pos1 = inputPos(arrS1.length);
                    printArrayStatic(addStatic(arrS1, arrS2, pos1));
                    return;
                case "1":
                    ArrayList<Integer> arrD1 = new ArrayList<Integer>();
                    System.out.println("Введите размер первого массива: ");
                    int size1 = properInputUnsigned();
                    fillArrayDynamic(arrD1, size1);
                    printArrayDynamic(arrD1);
                    ArrayList<Integer> arrD2 = new ArrayList<Integer>();
                    System.out.println("Введите размер второго массива: ");
                    int size2 = properInputUnsigned();
                    fillArrayDynamic(arrD2, size2);
                    printArrayDynamic(arrD2);
                    System.out.println("Введите позицию (индекс считать с 0, не может быть отрицательным или больше длины первого массива): ");
                    int pos2 = inputPos(arrD1.size());
                    printArrayDynamic(addDynamic(arrD1, arrD2, pos2));
                    return;
                default:
                    System.out.println("Неверный ввод! Пожалуйста введите 0 или 1");
            }
        }
    }
}
