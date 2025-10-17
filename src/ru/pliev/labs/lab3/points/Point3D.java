package ru.pliev.labs.lab3.points;

import java.util.Objects;

public class Point3D extends Point2D {

    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Point3D point3D = (Point3D) o;
        return Double.compare(z, point3D.z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), z);
    }

    @Override
    public String toString() {
        if ((int) z == z) {
            return super.toString().replace("}", "") + " ; " + (int) z + '}';
        }
        return super.toString().replace("}", "") + " ; " + z + '}';
    }
}
