package ru.pliev.labs.lab2;

import ru.pliev.labs.lab2.departmentAndEmpoyee.Department;
import ru.pliev.labs.lab2.departmentAndEmpoyee.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Lab2 {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    //Start lab2
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
                case "1.3":
                    runTask1_3();
                    break;
                case "1.4":
                    runTask1_4();
                    break;
                case "2.4":
                    runTask2_4();
                    break;
                case "3.4":
                    runTask3_4();
                    break;
                case "4.4":
                    runTask4_4();
                    break;
                case "5.4":
                    runTask5_4();
                    break;
                default:
                    System.out.println("Такой задачи нет!");
                    break;
            }
        }
    }

    //Task1_3
    private void runTask1_3() {
        Name cleopatra = new Name("Клеопатра");
        Name pushkin = new Name("Пушкин", "Александр", "Сергеевич");
        Name mayakovskiy = new Name("Маяковский", "Владимир");
        System.out.println(cleopatra.toString());
        System.out.println(pushkin.toString());
        System.out.println(mayakovskiy.toString());
    }

    //Task1_4
    private void runTask1_4() {
        Time time1 = new Time(10);
        Time time2 = new Time(10_000);
        Time time3 = new Time(100_000);
        System.out.println(time1.toString());
        System.out.println(time2.toString());
        System.out.println(time3.toString());
    }

    //Task2_4
    private void runTask2_4() {
        Department department = new Department("IT");
        Employee petrov = new Employee("Петров", department);
        department.addNewEmployee(petrov);
        Employee kozlov = new Employee("Козлов", department);
        department.addNewEmployee(kozlov);
        Employee sidorov = new Employee("Сидоров", department);
        department.addNewEmployee(sidorov);
        department.setBoss(kozlov);
        System.out.println(petrov.toString());
        System.out.println(kozlov.toString());
        System.out.println(sidorov.toString());
    }

    //Task3_4
    private void runTask3_4() {
        Department department = new Department("IT");
        Employee petrov = new Employee("Петров", department);
        department.addNewEmployee(petrov);
        Employee kozlov = new Employee("Козлов", department);
        department.addNewEmployee(kozlov);
        Employee sidorov = new Employee("Сидоров", department);
        department.addNewEmployee(sidorov);
        department.setBoss(kozlov);

        petrov.getDepartment().printAllEmployees();
    }

    //Task4_4
    private void runTask4_4() {
        Time time2 = new Time(10_000);
        Time time3 = new Time(2, 3, 5);
        System.out.println(time2.toString());
        System.out.println(time3.toString());
    }

    //Task5_4
    private void runTask5_4() {
        Time time1 = new Time(34056);
        Time time2 = new Time(4532);
        Time time3 = new Time(123);
        System.out.println(time1.getСurrentHours());
        System.out.println(time2.getCurrentMinutes());
        System.out.println(time3.getCurrentSeconds());
    }
}
