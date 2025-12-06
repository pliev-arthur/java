package ru.pliev.labs.lab5.fraction;

import java.util.Objects;

public class CasheFraction implements FractionInterface {
    private FractionInterface fraction;
    private Double cache = null;

    public CasheFraction(FractionInterface fraction) {
        this.fraction = fraction;
    }

    @Override
    public double getDoubleValue() {
        if (cache == null) {
            cache = fraction.getDoubleValue();
            return cache;
        } else {
            return cache;
        }
    }

    @Override
    public void setNumerator(int numerator) {
        fraction.setNumerator(numerator);
        cache = null;
    }

    @Override
    public void setDenominator(int denominator) {
        fraction.setDenominator(denominator);
        cache = null;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CasheFraction cfraction = (CasheFraction) o;
        return fraction == cfraction.fraction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fraction, cache);
    }

    @Override
    public String toString() {
        return "CasheFraction{" +
                "fraction=" + fraction +
                ", cache=" + cache +
                '}';
    }
}

