package ru.pliev.labs.lab6;

import ru.pliev.labs.lab5.cats.Cat;
import ru.pliev.labs.lab6.task1_1.Invoke;
import ru.pliev.labs.lab6.task1_1.InvokeAnnotatedMethods;
import ru.pliev.labs.lab6.task1_1.PurringCat;
import ru.pliev.labs.lab6.task1_2.Default;
import ru.pliev.labs.lab6.task1_2.DefaultAnnotationProcessor;
import ru.pliev.labs.lab6.task1_3.Person;
import ru.pliev.labs.lab6.task1_3.ToStringProcessor;
import ru.pliev.labs.lab6.task1_4.ValidateProcessor;

import java.util.*;

public class Lab6 {
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
                case "1.3":
                    runTask1_3();
                    break;
                case "1.4":
                    runTask1_4();
                    break;
                default:
                    System.out.println("Такой задачи нет!");
                    break;
            }
        }
    }

    public void runTask1_1() {
        PurringCat cat = new PurringCat("Кулёк", "рыба");
        try {
            InvokeAnnotatedMethods.invoke(cat, Invoke.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void runTask1_2() {
        DefaultAnnotationProcessor.printDefaultClasses(PurringCat.class);
        System.out.println("\n");
        DefaultAnnotationProcessor.printDefaultClasses(Cat.class);
    }

    public void runTask1_3() {
        Person person = new Person("Иван Иванов", 30, "secret123", "ivan@mail.ru", 50000);
        try {
            System.out.println(ToStringProcessor.toString(person));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void runTask1_4() {
        ValidateProcessor.printValidatedThings(Default.class);
    }
}
