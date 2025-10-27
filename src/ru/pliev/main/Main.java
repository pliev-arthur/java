package ru.pliev.main;
import ru.pliev.labs.lab1.*;
import ru.pliev.labs.lab2.*;
import ru.pliev.labs.lab3.*;
import ru.pliev.labs.lab4.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        if (args.length == 2) {
            double result = power(args[0], args[1]);
            System.out.println("Результат: " + result);
        }
        Lab4 lab4 =  new Lab4();
        lab4.run();
    }
    public static double power(String xStr, String yStr) {
        int x = parseInt(xStr);
        int y = parseInt(yStr);
        return pow(x, y);
    }
}