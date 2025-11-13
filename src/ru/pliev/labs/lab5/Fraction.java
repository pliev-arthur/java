package ru.pliev.labs.lab5;

import java.util.Objects;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Ошибка! Знаменатель не может быть равен нулю!");
        }
        if (denominator < 0) {
            this.numerator = -numerator;
            this.denominator = -denominator;
            reduction();
            return;
        }
        this.denominator = denominator;
        this.numerator = numerator;
        reduction();
    }

    private void reduction() {
        int n = this.numerator;
        int d = this.denominator;
        int gcd = findGCD(Math.abs(n), Math.abs(d));
        numerator = n / gcd;
        denominator = d / gcd;
    }
    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraсtion = (Fraction) o;
        return numerator == fraсtion.numerator && denominator == fraсtion.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
