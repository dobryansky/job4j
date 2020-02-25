package ru.job4j.oop;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class PointLesson {

    private int x;
    private int y;

    public PointLesson(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public double distance(PointLesson that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        PointLesson a = new PointLesson(0, 0);
        PointLesson b = new PointLesson(0, 2);
        double dist1 = a.distance(b);

        System.out.println(" Длина отрезка 2D = " + dist1);

    }
}