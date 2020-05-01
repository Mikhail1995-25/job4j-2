package ru.job4j.conditionTest;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        int in = 0;
        int in1 = 0;
        int in2 = 2;
        int in3 = 0;
        double expected = 2.0;
        double out = Point.distance(in, in1, in2, in3);
        Assert.assertEquals(expected, out, 0.001);

    }
}
