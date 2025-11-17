package ru.pliev.labs.lab5.fraction;

import java.util.Objects;

public class Fraction implements FractionInterface {
    private int numerator;
    private int denominator;
    private Double cache = null;

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
            return;
        }
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public void reduction() {
        int n = this.numerator;
        int d = this.denominator;
        int gcd = findGCD(Math.abs(n), Math.abs(d));
        numerator = n / gcd;
        denominator = d / gcd;
    }

    @Override
    public double getDoubleValue() {
        if (cache == null) {
            cache = (double) numerator / denominator;
            return cache;
        }
        else {
            return cache;
        }
    }

    @Override
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        cache = null;
    }

    @Override
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Ошибка! Знаменатель не может быть равен нулю!");
        }
        if (denominator < 0) {
            numerator = -numerator;
            this.denominator = -denominator;
            return;
        }
        this.denominator = denominator;
        cache = null;
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
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
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
