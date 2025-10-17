package ru.pliev.labs.lab3.points;

import java.util.Objects;

public class Point2D {
    protected double x;
    protected double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point2D point2D = (Point2D) o;
        return Double.compare(x, point2D.x) == 0 && Double.compare(y, point2D.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        if ((int) x == x && (int) y == y) {
            return "{" +
                    (int) x +
                    " ; " + (int) y +
                    '}';
        }
        if ((int) x == x) {
            return "{" +
                    (int) x +
                    " ; " + y +
                    '}';
        }
        if ((int) y == y) {
            return "{" + x +
                    " ; " + (int) y +
                    '}';
        }
        return "{" +
                 x +
                " ; " + y +
                '}';
    }
}
