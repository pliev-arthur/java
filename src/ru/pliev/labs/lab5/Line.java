package ru.pliev.labs.lab5;

import ru.pliev.labs.lab3.points.Point2D;

public class Line {
    private Point2D start;
    private Point2D finish;

    public Line(Point2D start, Point2D finish) {
        this.start = start;
        this.finish = finish;
    }

    public Point2D getStart() {
        return start;
    }

    public void setStart(Point2D start) {
        this.start = start;
    }

    public Point2D getFinish() {
        return finish;
    }

    public void setFinish(Point2D finish) {
        this.finish = finish;
    }

    @Override
    public String toString() {
        return "Линия от {" + start.getX() + ":" + start.getY() + "} до {" + finish.getX() + ":" + finish.getY() + "}";
    }
}
