package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

public class PointTest {

    @Test
    public void distance() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 5;
        int y2 = 6;
        double expected = 6.403;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
