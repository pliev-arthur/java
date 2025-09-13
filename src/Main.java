import labs.lab1.task1.*;
import labs.lab1.task2.*;
import labs.lab1.task3.*;
import labs.lab1.task4.*;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String input;
        System.out.println("Справка:");
        System.out.println("Формат ввода задач - задание.задача");
        System.out.println("0 - выход");
        while (true) {
            System.out.println("Введите номер задачи: ");
            input = scanner.nextLine();
            switch (input) {
                case "0":
                    return;
                case "1.1":
                    Task1_1 task1_1 = new Task1_1();
                    task1_1.run();
                    break;
                case "1.3":
                    Task1_3 task1_3 = new Task1_3();
                    task1_3.run();
                    break;
                case "1.5":
                    Task1_5 task1_5 = new Task1_5();
                    task1_5.run();
                    break;
                case "1.7":
                    Task1_7 task1_7 = new Task1_7();
                    task1_7.run();
                    break;
                case "1.9":
                    Task1_9 task1_9 = new Task1_9();
                    task1_9.run();
                    break;
                case "2.1":
                    Task2_1 task2_1 = new Task2_1();
                    task2_1.run();
                    break;
                case "2.3":
                    Task2_3 task2_3 = new Task2_3();
                    task2_3.run();
                    break;
                case "2.5":
                    Task2_5 task2_5 = new Task2_5();
                    task2_5.run();
                    break;
                case "2.7":
                    Task2_7 task2_7 = new Task2_7();
                    task2_7.run();
                    break;
                case "2.9":
                    Task2_9 task2_9 = new Task2_9();
                    task2_9.run();
                    break;
                case "3.1":
                    Task3_1 task3_1 = new Task3_1();
                    task3_1.run();
                    break;
                case "3.3":
                    Task3_3 task3_3 = new Task3_3();
                    task3_3.run();
                    break;
                case "3.5":
                    Task3_5 task3_5 = new Task3_5();
                    task3_5.run();
                    break;
                case "3.7":
                    Task3_7 task3_7 = new Task3_7();
                    task3_7.run();
                    break;
                case "3.9":
                    Task3_9 task3_9 = new Task3_9();
                    task3_9.run();
                    break;
                case "4.1":
                    Task4_1 task4_1 = new Task4_1();
                    task4_1.run();
                    break;
                case "4.3":
                    Task4_3 task4_3 = new Task4_3();
                    task4_3.run();
                    break;
                case "4.5":
                    Task4_5 task4_5 = new Task4_5();
                    task4_5.run();
                    break;
                case "4.7":
                    Task4_7 task4_7 = new Task4_7();
                    task4_7.run();
                    break;
                case "4.9":
                    Task4_9 task4_9 = new Task4_9();
                    task4_9.run();
                    break;
                default:
                    System.out.println("Такой задачи нет!");
                    break;
            }
        }
    }
}