package ru.pliev.labs.lab3;

import ru.pliev.labs.lab2.*;
import ru.pliev.labs.lab2.departmentAndEmpoyee.Department;
import ru.pliev.labs.lab2.departmentAndEmpoyee.Employee;
import ru.pliev.labs.lab3.birds.*;
import ru.pliev.labs.lab3.points.Point2D;
import ru.pliev.labs.lab3.points.Point3D;
import ru.pliev.main.AllCreaturesSinging;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Lab3 {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    //Start lab3
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
                case "1.2":
                    runTask1_2();
                    break;
                case "1.11":
                    runTask1_11();
                    break;
                case "2.4":
                    runTask2_4();
                    break;
                case "3.5":
                    runTask3_5();
                    break;
                case "4.3":
                    runTask4_3();
                    break;
                case "5.2":
                    runTask5_2();
                    break;
                case "6.2":
                    runTask6_2();
                    break;
                default:
                    System.out.println("Такой задачи нет!");
                    break;
            }
        }
    }

    public void runTask1_2() {
        //Using class Time from lab2
        Time time1 = new Time(10);
        Time time2 = new Time(10_000);
        Time time3 = new Time(900_000);
        System.out.println(time1.toString());
        System.out.println(time2.toString());
        System.out.println(time3.toString());
    }

    public void runTask1_11() {
        //Using classes Employee and Department from lab2
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
        department.printAllEmployees();
        Employee ivanov = new Employee("Иванов", department);
        department.setBoss(ivanov);
        System.out.println(ivanov.toString());
        department.printAllEmployees();
    }

    public void runTask2_4() {
        BinaryTreeNode Tree = new BinaryTreeNode();
        //Test1 addNode()
        Tree.addNode(13); //Root
        Tree.addNode(18); //rightChild
        Tree.addNode(2);//leftChild
        Tree.addNode(17);
        Tree.addNode(19);
        Tree.addNode(20);


        //Root
        System.out.println("Root: " + Tree.searchAndShow(13));

        //rightChild1 - for every rightChild number is always 1

        System.out.println("rightChild1: " + Tree.searchAndShow(18));

        //leftChild0 - for every rightChild number is always 0
        System.out.println("leftChild0: " + Tree.searchAndShow(2));

        //rightChild11 - this is rightChild for rightChild1
        System.out.println("rightChild11: " + Tree.searchAndShow(19));

        System.out.println("rightChild10: " + Tree.searchAndShow(17));

        System.out.println("rightChild111: " + Tree.searchAndShow(20));
        Tree.deleteNode(18);

        System.out.println(Tree);
    }

    public void runTask3_5() {
        Point3D point1 = new Point3D(0, 0, 0);
        Point3D point2 = new Point3D(-3, 1.2, -2.3);
        Point3D point3 = new Point3D(3.4, -7.65, 3);
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
    }

    public void runTask4_3() {
        Sparrow sparrow = new Sparrow();
        Сuckoo сuckoo = new Сuckoo();
        Parrot parrot = new Parrot("Сидим не рыпаемся");
        System.out.println(sparrow);
        System.out.println(сuckoo);
        System.out.println(parrot);
        sparrow.sing();
        сuckoo.sing();
        parrot.sing();
    }

    public void runTask5_2() {
        Bird sparrow1 = new Sparrow();
        Bird сuckoo1 = new Сuckoo();
        Bird parrot1 = new Parrot("Сидим не рыпаемся");
        Bird sparrow2 = new Sparrow();
        Bird сuckoo2 = new Сuckoo();
        Bird parrot2 = new Parrot("Играем от защиты");
        ArrayList<Bird> birds = new ArrayList<Bird>(List.of(sparrow1,сuckoo1,parrot1,sparrow2,сuckoo2, parrot2));
        new AllCreaturesSinging().allCreaturesSinging(birds);
    }

    public void runTask6_2() {
        Point2D point1 = new Point2D(-1, -4.33);
        Point2D point2 = new Point2D(-1, -4.33);
        Point2D point3 = new Point2D(1, -4.33);
        Point3D point4 = new Point3D(2,2,3);
        Point3D point5 = new Point3D(2,2,3);
        Point3D point6 = new Point3D(3,2,3);
        System.out.println(point1.equals(point2));
        System.out.println(point3.equals(point2));
        System.out.println(point4.equals(point5));
        System.out.println(point6.equals(point5));
    }


}
