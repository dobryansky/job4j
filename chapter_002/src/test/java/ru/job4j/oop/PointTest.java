package ru.job4j.oop;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    public PointTest(){

    }
    @Test
    
    public void distance () {
        int x1=0;
        int x2=0;
        int y1=2;
        int y2=0;
        Point point1 = new Point(x1,y1);
        Point point2 = new Point(x2,y2);
        double out = point1.distance(point2);
        double expected = 2;
        Assert.assertEquals(expected,out,0.01D);

    }

    @Test
    public void distance3d () {
        int x1=0;
        int x2=0;
        int y1=2;
        int y2=0;
        int z1=2;
        int z2=0;
        Point point1 = new Point(x1,y1,z1);
        Point point2 = new Point(x2,y2,z2);
        double out = point1.distance3d(point2);
        double expected = 2.82;
        Assert.assertEquals(expected,out,0.01D);

    }


}

