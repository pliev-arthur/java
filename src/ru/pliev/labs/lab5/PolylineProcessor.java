package ru.pliev.labs.lab5;

import ru.pliev.labs.lab3.points.Point2D;

import java.util.List;
import java.util.stream.Collectors;

public class PolylineProcessor {

    public static Polyline processPoints(List<Point2D> points) {
        List<Point2D> processedPoints = points.stream()
                .distinct()
                .sorted((p1,p2) -> Double.compare(p1.getX(), p2.getX()))
                .map(point -> {
                    double newY = point.getY() < 0 ? -point.getY() : point.getY();
                    return new Point2D(point.getX(), newY);
                })
                .collect(Collectors.toList());
        return new Polyline(processedPoints);
    }
}