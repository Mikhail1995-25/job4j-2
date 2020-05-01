package ru.job4j.arrayTest;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SquareTest {
    @Test
    public void when4To0149() {
        int bound = 4;
        int[] rst = Square.calculate(bound);
        int[]  expect = new int[] {0, 1, 4, 9};
        assertThat(rst, is(expect));

    }
    @Test
    public void when5To014916() {
        int bound = 5;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[] {0, 1, 4, 9, 16};
        assertThat(rst, is(expect));
    }
}
