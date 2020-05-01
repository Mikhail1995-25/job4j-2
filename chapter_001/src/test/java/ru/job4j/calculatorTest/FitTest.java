package ru.job4j.calculatorTest;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 174;
        double expected = 85.1;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.001);

    }
    @Test
    public void womanWeight() {
        double in = 170;
        double expected = 69.0;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.001);
    }
}
