package labs.lab1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Lab1 {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    //Start lab1
    public void run() {
        String input;
        System.out.println("Справка:");
        System.out.println("Формат ввода задач - задание.задача");
        System.out.println("0 - выход");
        while (true) {
            System.out.println("Введите номер задачи: ");
            input = scanner.nextLine().trim();
            switch (input) {
                case "0":
                    return;
                case "1.1":
                    runTask1_1();
                    scanner.nextLine();
                    break;
                case "1.3":
                    runTask1_3();
                    break;
                case "1.5":
                    runTask1_5();
                    scanner.nextLine();
                    break;
                case "1.7":
                    runTask1_7();
                    scanner.nextLine();
                    break;
                case "1.9":
                    runTask1_9();
                    scanner.nextLine();
                    break;
                case "2.1":
                    runTask2_1();
                    scanner.nextLine();
                    break;
                case "2.3":
                    runTask2_3();
                    scanner.nextLine();
                    break;
                case "2.5":
                    runTask2_5();
                    scanner.nextLine();
                    break;
                case "2.7":
                    runTask2_7();
                    scanner.nextLine();
                    break;
                case "2.9":
                    runTask2_9();
                    scanner.nextLine();
                    break;
                case "3.1":
                    runTask3_1();
                    scanner.nextLine();
                    break;
                case "3.3":
                    runTask3_3();
                    scanner.nextLine();
                    break;
                case "3.5":
                    runTask3_5();
                    scanner.nextLine();
                    break;
                case "3.7":
                    runTask3_7();
                    scanner.nextLine();
                    break;
                case "3.9":
                    runTask3_9();
                    scanner.nextLine();
                    break;
                case "4.1":
                    runTask4_1();
                    scanner.nextLine();
                    break;
                case "4.3":
                    runTask4_3();
                    scanner.nextLine();
                    break;
                case "4.5":
                    runTask4_5();
                    scanner.nextLine();
                    break;
                case "4.7":
                    runTask4_7();
                    scanner.nextLine();
                    break;
                case "4.9":
                    runTask4_9();
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("Такой задачи нет!");
                    break;
            }
        }
    }

    // "input" methods
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
    private char properInputT1_3() {
        String string = "";
        while ((string.length() != 1) || ((string.charAt(0) < '0') || (string.charAt(0) > '9'))) {
            System.out.println("Введите целое число от 0 до 9: ");
            string = scanner.nextLine();
        }
        return string.charAt(0);
    }
    private int inputInt() {
        int input;
        System.out.println("Введите целое число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Неверный ввод!");
            scanner.next();
        }
        input = scanner.nextInt();
        return input;
    }
    private int inputUnsignedInt() {
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
    private long inputUnsignedLong() {
        long input;
        System.out.println("Введите целое положительное число: ");
        do {
            while (!scanner.hasNextLong()) {
                System.out.println("Неверный ввод!");
                scanner.next();
            }
            input = scanner.nextLong();
            if (input < 0) {
                System.out.println("Неверный ввод!");
            }
        } while (input < 0);
        return input;
    }
    private int inputPos(int arrSize) {
        int input;
        do {
            input = inputUnsignedInt();
            if (input > arrSize) {
                System.out.println("Неверный ввод!");
            }
        } while (input > arrSize);
        return input;
    }

    //Task1_1
    private double fraction (double x) {
        return x % 1;
    }
    private void runTask1_1() {
        double input = inputDouble();
        System.out.printf(Locale.US,"%.3f%n",fraction(input));
    }

    //Task1_3
    private int charToNum (char x) {
        return (x - '0');
    }
    private void runTask1_3() {
        char input = properInputT1_3();
        System.out.println(charToNum(input));
    }

    //Task1_5
    private boolean is2Digit(int x) {
        return ((x >= 10) && (x <= 99));
    }
    private void runTask1_5() {
        int input = inputInt();
        System.out.println(is2Digit(input));
    }

    //Task1_7
    private boolean isInRange (int a, int b, int num) {
        if (a >= b) {
            return ((num >= b) && (num <= a));
        }
        else {
            return ((num >= a) && (num <= b));
        }

    }
    private void runTask1_7() {
        System.out.println("Справка: Все числа должны быть целыми!");
        System.out.println("Введите первую границу диапазона: ");
        int a = inputInt();
        System.out.println("Введите вторую границу диапазона: ");
        int b = inputInt();
        System.out.println("Введите число: ");
        int num = inputInt();
        System.out.println(isInRange (a, b, num));
    }

    //Task1_9
    private boolean isEqual (int a, int b, int c) {
        return (a == b) && (b == c);
    }
    private void runTask1_9() {
        System.out.println("Справка: Все числа должны быть целыми!");
        System.out.println("Введите первое число: ");
        int a = inputInt();
        System.out.println("Введите второе число: ");
        int b = inputInt();
        System.out.println("Введите третье число: ");
        int c = inputInt();
        System.out.println(isEqual (a, b, c));
    }

    //Task2_1
    private int abs(int x) {
        if (x < 0) {
            return -x;
        }
        else {
            return x;
        }
    }
    private void runTask2_1() {
        int input = inputInt();
        System.out.println(abs(input));
    }

    //Task2_3
    private boolean is35(int x) {
        if ((x % 3 == 0) && (x % 5 == 0)) {
            return false;
        }
        else {
            return (x % 3 == 0) || (x % 5 == 0);
        }
    }
    private void runTask2_3() {
        int input = inputInt();
        System.out.println(is35(input));
    }

    //Task2_5
    private int max3(int x, int y, int z) {
        int max;
        if (x > y) {
            max = x;
        }
        else {
            max = y;
        }
        if (max < z) {
            max = z;
        }
        return max;
    }
    private void runTask2_5() {
        System.out.println("Справка: Все числа должны быть целыми!");
        System.out.println("Введите первое число: ");
        int a = inputInt();
        System.out.println("Введите второе число: ");
        int b = inputInt();
        System.out.println("Введите третье число: ");
        int c = inputInt();
        System.out.println(max3(a, b, c));
    }

    //Task2_7
    private int sum2(int x, int y) {
        int sum = (x + y);
        if ((sum >= 10) && (sum <= 19)) {
            return 20;
        }
        else {
            return sum;
        }
    }
    private void runTask2_7() {
        System.out.println("Справка: Все числа должны быть целыми!");
        System.out.println("Введите первое число: ");
        int a = inputInt();
        System.out.println("Введите второе число: ");
        int b = inputInt();
        System.out.println(sum2(a, b));
    }

    //Task2_9
    private String day(int x) {
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
    private void runTask2_9() {
        int input = inputInt();
        System.out.println(day(input));
    }

    //Task3_1
    private String listNums(int x) {
        String result = "";
        for (int i = 0; i <= x; i++) {
            result += i + " ";
        }
        return result;
    }
    private void runTask3_1() {
        int input = inputUnsignedInt();
        System.out.println(listNums(input));
    }

    //Task3_3
    private String chet(int x) {
        String result = "";
        for (int i = 0; i <= x; i+=2) {
            result += i + " ";
        }
        return result;
    }
    private void runTask3_3() {
        int input = inputUnsignedInt();
        System.out.println(chet(input));
    }

    //Task3_5
    private int numLen(long x) {
        int result = 0;
        while (x > 0) {
            x = x / 10;
            result++;
        }
        return result;
    }
    private void runTask3_5() {
        long input = inputUnsignedLong();
        System.out.println(numLen(input));
    }

    //Task3_7
    private void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    private void runTask3_7() {
        int input = inputUnsignedInt();
        square(input);
    }

    //Task3_9
    private void rightTriangle(int x) {
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
    private void runTask3_9() {
        int input = inputUnsignedInt();
        rightTriangle(input);
    }

    //Task4_* methods and values
    int n = 7;
    private void fillArrayStatic(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите элемент массива (осталось " + (n - i) + ")");
            arr[i] = inputInt();
        }
    }
    private void fillArrayDynamic(ArrayList<Integer> arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("Введите элемент массива (осталось " + (size - i) + ")");
            arr.add(inputInt());
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

    //Task4_1
    private int findFirstStatic(int[] arr, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    private int findFirstDynamic(ArrayList<Integer> arr, int x) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                return i;
            }
        }
        return -1;
    }
    private void runTask4_1() {
        System.out.println("Справка: все числа должны быть целыми, размер массива не может быть отрицательным");
        System.out.println("Введите x: ");
        int x = inputInt();
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
                    int size = inputUnsignedInt();
                    fillArrayDynamic(arrD, size);
                    System.out.println(findFirstDynamic(arrD, x));
                    return;
                default:
                    System.out.println("Неверный ввод! Пожалуйста введите 0 или 1");
            }
        }
    }

    //Task4_3
    private int maxAbsStatic(int[] arr) {
        int max = abs(arr[0]);
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            if (abs(arr[i]) > max) {
                max = abs(arr[i]);
                result = arr[i];
            }
        }
        return result;
    }
    private int maxAbsDynamic(ArrayList<Integer> arr) {
        int max = abs(arr.get(0));
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (abs(arr.get(i)) > max) {
                max = abs(arr.get(i));
                result = arr.get(i);
            }
        }
        return result;
    }
    private void runTask4_3() {
        System.out.println("Справка: все числа должны быть целыми, размер массива не может быть отрицательным");
        System.out.println("Выберите: ");
        System.out.println("0 - статический массив на 7 элементов");
        System.out.println("1 - динамический массив размером n");
        while (true) {
            String choice = scanner.next();
            switch (choice) {
                case "0":
                    int[] arrS = new int[n];
                    fillArrayStatic(arrS);
                    System.out.println(maxAbsStatic(arrS));
                    return;
                case "1":
                    ArrayList<Integer> arrD = new ArrayList<Integer>();
                    System.out.println("Введите размер массива: ");
                    int size = inputUnsignedInt();
                    fillArrayDynamic(arrD, size);
                    System.out.println(maxAbsDynamic(arrD));
                    return;
                default:
                    System.out.println("Неверный ввод! Пожалуйста введите 0 или 1");
            }
        }
    }

    //Task4_5
    private int[] addStatic(int[] arr1, int[] arr2, int pos) {
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
    private ArrayList<Integer> addDynamic(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int pos) {
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
    private void runTask4_5() {
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
                    int size1 = inputUnsignedInt();
                    fillArrayDynamic(arrD1, size1);
                    printArrayDynamic(arrD1);
                    ArrayList<Integer> arrD2 = new ArrayList<Integer>();
                    System.out.println("Введите размер второго массива: ");
                    int size2 = inputUnsignedInt();
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

    //Task4_7
    private int[] reverseBackStatic(int[] arr) {
        int arrRes[] = new int[n];
        for (int i = 0; i < n; i++) {
            arrRes[i] = arr[n-1-i];
        }
        return arrRes;
    }
    private ArrayList<Integer> reverseBackDynamic(ArrayList<Integer> arr) {
        ArrayList<Integer> arrRes = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            arrRes.add(arr.get(arr.size()-1-i));
        }
        return arrRes;
    }
    private void runTask4_7() {
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
                    printArrayStatic(reverseBackStatic(arrS1));
                    return;
                case "1":
                    ArrayList<Integer> arrD1 = new ArrayList<Integer>();
                    System.out.println("Введите размер массива: ");
                    int size1 = inputUnsignedInt();
                    fillArrayDynamic(arrD1, size1);
                    printArrayDynamic(arrD1);
                    printArrayDynamic(reverseBackDynamic(arrD1));
                    return;
                default:
                    System.out.println("Неверный ввод! Пожалуйста введите 0 или 1");
            }
        }
    }

    //Task4_9
    private int[] findAllStatic(int[] arr, int x) {
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
    private ArrayList<Integer> findAllDynamic(ArrayList<Integer> arr, int x) {
        ArrayList<Integer> arrRes = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                arrRes.add(i);
            }
        }
        return arrRes;
    }
    private void runTask4_9() {
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
                    int x1 = inputInt();
                    printArrayStatic(findAllStatic(arrS1, x1));
                    return;
                case "1":
                    ArrayList<Integer> arrD1 = new ArrayList<Integer>();
                    System.out.println("Введите размер массива: ");
                    int size1 = inputUnsignedInt();
                    fillArrayDynamic(arrD1, size1);
                    printArrayDynamic(arrD1);
                    System.out.println("Введите x: ");
                    int x2 = inputInt();
                    printArrayDynamic(findAllDynamic(arrD1, x2));
                    return;
                default:
                    System.out.println("Неверный ввод! Пожалуйста введите 0 или 1");
            }
        }
    }
}
