package ru.job4j.arrayTest;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Class MinTest
 * Проводит проверку кода на наличие минимального элемента массива.
 */

public class MinTest {
    @Test
    public void whenFirstMin() {
        assertThat(Min.findMin(
                new int[] {0, 5, 10}),
                is(0));
    }
    @Test
    public void whenLastMin() {
        assertThat(Min.findMin(
                new int[] {10, 5, 3}),
                is(3));

    }
    @Test
    public void whenMiddleMin() {
        assertThat(Min.findMin(
                new int[] {10, 2, 5}),
                is(2));
    }
}
