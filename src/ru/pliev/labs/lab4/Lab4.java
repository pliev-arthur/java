package ru.pliev.labs.lab4;

import ru.pliev.labs.lab3.points.Point2D;
import ru.pliev.labs.lab3.points.Point3D;
import ru.pliev.labs.lab4.filters.LengthFilter;
import ru.pliev.labs.lab4.filters.PositiveArrayFilter;
import ru.pliev.labs.lab4.filters.PositiveFilter;
import ru.pliev.labs.lab4.functions.Abs;
import ru.pliev.labs.lab4.functions.MaxFromList;
import ru.pliev.labs.lab4.functions.StringLength;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Lab4 {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

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
                    break;
                case "1.2":
                    runTask1_2();
                    break;
                case "2.3":
                    runTask2_3();
                    break;
                case "3.1":
                    runTask3_1();
                    break;
                case "3.2":
                    runTask3_2();
                    break;
                default:
                    System.out.println("Такой задачи нет!");
                    break;
            }
        }
    }

    private <T> void printBox(Box<T> box) {
        System.out.println(box);
    }
    public void runTask1_1() {
        Box<Integer> box = new Box<>();
        box.setThing(3);
        printBox(box);
        Box<String> box2 = new Box<>();
        box2.setThing("РОССИЯ ВПЕРЕД!!!");
        printBox(box2);
    }

    public <T> void printStorage(Storage<T> storage, T alternative) {
        T item = storage.getItem(alternative);
        System.out.println(item);
    }
    public void runTask1_2() {
        Storage<Integer> storage1 = new Storage<>(null);
        printStorage(storage1, 0);

        Storage<Integer> storage2 = new Storage<>(99);
        printStorage(storage2, -1);

        Storage<String> storage3 = new Storage<>(null);
        printStorage(storage3, "default");

        Storage<String> storage4 = new Storage<>("hello");
        printStorage(storage4, "hello world");
    }

    private void putPointInBox(Box<? super Point2D> box) {
        System.out.println(box);
    }
    public void runTask2_3() {
        Point2D point1 = new Point2D(1,2);
        Point3D point2 = new Point3D(1,2,3);
        Box<? super Point2D> box1 = new Box<>(point1);
        Box<? super Point2D> box2 = new Box<>(point2);
        putPointInBox(box1);
        putPointInBox(box2);
    }
    public void runTask3_1() {
        List<String> arr1 = List.of("qwerty", "asdfg", "zx");
        List<Integer> arr2 = List.of(1, -3, 7);
        List<int[]> arr3 = List.of(new int[]{1, 2, 3}, new int[]{1, -2, -34}, new int[]{10, 32, 3});
        System.out.println(ApplyFunctionToList.applyFunctionToList(arr1, new StringLength()));
        System.out.println(ApplyFunctionToList.applyFunctionToList(arr2, new Abs()));
        System.out.println(ApplyFunctionToList.applyFunctionToList(arr3, new MaxFromList()));
    }
    public void runTask3_2() {
        List<String> arr1 = List.of("qwerty", "asdfg", "zx");
        List<Integer> arr2 = List.of(1, -3, 7);
        List<List<Integer>> arr3 = List.of(List.of(10,3,4), List.of(12,5,7), List.of(10,-3,4));
        System.out.println(FilteringList.filteringList(arr1, new LengthFilter()));
        System.out.println(FilteringList.filteringList(arr2, new PositiveFilter()));
        System.out.println(FilteringList.filteringList(arr3, new PositiveArrayFilter()));
    }

}
