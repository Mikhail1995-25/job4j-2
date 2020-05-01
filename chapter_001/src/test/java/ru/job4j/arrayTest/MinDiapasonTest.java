package ru.job4j.arrayTest;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Class Test MinDiapasonTest
 * Проверяет код на наличие минимального числа.
 */

public class MinDiapasonTest {
    @Test
    public void whenFirstMin() {
        assertThat(MinDiapason.findMin(
                new int[] {-1, 0, 5, 10}, 1, 3),
                is(0));
    }
    @Test
    public void whenLastMin() {
        assertThat(MinDiapason.findMin(
                new int[] {10, 5, 3, 1}, 1, 3),
                is(3));
    }
    @Test
    public void whenMiddleMin() {
        assertThat(MinDiapason.findMin(
                new int[] {10, 2, 5, 1}, 0, 2),
                is(2));
    }
}
