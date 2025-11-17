package ru.pliev.labs.lab5;

import ru.pliev.labs.lab3.points.Point2D;
import ru.pliev.labs.lab5.cats.Cat;
import ru.pliev.labs.lab5.cats.MeowCounter;
import ru.pliev.labs.lab5.cats.Meowable;
import ru.pliev.labs.lab5.cats.Meowing;
import ru.pliev.labs.lab5.fraction.Fraction;
import ru.pliev.labs.lab5.gasStation.*;
import ru.pliev.labs.lab5.people.PeopleProcessor;
import ru.pliev.labs.lab5.voicelessConsonants.VCAnalyzer;

import java.util.*;

public class Lab5 {
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
                case "2.1":
                    runTask2_1();
                    break;
                case "3.2":
                    runTask3_2();
                    break;
                case "4.7":
                    runTask4_7();
                    break;
                case "5.2":
                    runTask5_2();
                    break;
                case "6.3":
                    runTask6_3();
                    break;
                case "7.1":
                    runTask7_1();
                    break;
                case "7.2":
                    runTask7_2();
                    break;
                default:
                    System.out.println("Такой задачи нет!");
                    break;
            }
        }
    }

    public void runTask1_1() {
        Fraction f1 = new Fraction(4, 8);
        System.out.println(f1.getDoubleValue());
        f1.setNumerator(2);
        System.out.println(f1.getDoubleValue());
        f1.setDenominator(1);
        System.out.println(f1.getDoubleValue());
    }

    public void runTask2_1() {
        Cat cat1 = new Cat("Барсик");
        MeowCounter cat1Counter = new MeowCounter(cat1);
        List<? extends Meowable> catList = List.of(cat1Counter, cat1Counter, cat1Counter, cat1Counter, cat1Counter);
        Meowing.meowing(catList);
        System.out.println(cat1Counter.getMeowCount());
    }

    public void runTask3_2() {
        List<Integer> l = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 1, 2, 3));
        List<Integer> l1 = List.of(1, 2, 3);
        List<Integer> l2 = List.of(6, 7);
        ReplaceFirstOccurrence.replace(l, l1, l2);
        System.out.println(l);
    }

    public void runTask4_7() {
        GasStationAnalyzer.analyzeGasStations("src\\ru\\pliev\\labs\\lab5\\gasStation\\gas_stations.txt");
    }

    public void runTask5_2() {
        VCAnalyzer.findMissingVoicelessConsonants("src\\ru\\pliev\\labs\\lab5\\voicelessConsonants\\rus_text.txt");
    }

    public void runTask6_3() {
        Queue<Integer> q1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(CircularQueueCheck.hasEqualNeighbors(q1));
        Queue<String> q2 = new LinkedList<>(Arrays.asList("a", "b", "c", "c"));
        System.out.println(CircularQueueCheck.hasEqualNeighbors(q2));
        Queue<Integer> q3 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 1));
        System.out.println(CircularQueueCheck.hasEqualNeighbors(q3));
        try {
            System.out.println(CircularQueueCheck.hasEqualNeighbors(null));
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public void runTask7_1() {
        List<Point2D> points = Arrays.asList(
                new Point2D(3, 4),
                new Point2D(1, -2),
                new Point2D(3, 4),
                new Point2D(5, 7),
                new Point2D(2, -5),
                new Point2D(0, 1)
        );
        Polyline polyline = PolylineProcessor.processPoints(points);
        System.out.println("Исходные точки: " + points);
        System.out.println("Результирующая ломаная: " + polyline);
    }

    public void runTask7_2() {
        PeopleProcessor.processPeople("src\\ru\\pliev\\labs\\lab5\\people\\people.txt");
    }
}
