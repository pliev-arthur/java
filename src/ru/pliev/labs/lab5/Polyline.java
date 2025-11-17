package ru.pliev.labs.lab5;

import ru.pliev.labs.lab3.points.Point2D;

import java.util.List;

public class Polyline {
    private List<Point2D> points;

    public Polyline(List<Point2D> points) {
        this.points = points;
    }

    public List<Point2D> getPoints() {
        return points;
    }

    public void setPoints(List<Point2D> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Линия: " + points;
    }
}
