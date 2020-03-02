package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * SwitchArrayTest
 * Тест класс.
 */

public class SwitchArrayTest {
    /**
     * Method - Проверяет код.
     */
    @Test
    public void whenSwap0to5() {
       int[] input = {1, 2, 3, 4};
       int[] expect = {4, 2, 3, 1};
       int[] rs1 = SwitchArray.swap(input, 0, input.length - 1);
       assertThat(rs1, is(expect));
    }
    @Test
    public void whenSwap0to10() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expect = {9, 2, 3, 4, 5, 6, 7, 8, 1};
        int[] rs1 = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rs1, is(expect));
    }
    @Test
    public void whenSwap0to6() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expect = {5, 2, 3, 4, 1};
        int[] rs1 = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rs1, is(expect));
    }
}
