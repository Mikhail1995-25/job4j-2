package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class SizeTest {

    @Test
    public void info() {
        int in = 10;
        int in1 = 20;
        int expected = 30;
        int out = Size.add(in, in1);
        Assert.assertEquals(expected, out);

    }
}
