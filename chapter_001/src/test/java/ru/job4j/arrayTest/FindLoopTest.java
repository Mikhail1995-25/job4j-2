package ru.job4j.arrayTest;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * FindLoopTest - Тест класс.
 */

public class FindLoopTest {
    /**
     * Method whenArrayHas5Then0 - Устанавливает заданный массив
     * и значение этого массива.
     * Тестируем код.
     *
     */
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas3Then4() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {2, 5, 9, 1, 3, 10, 8};
        int value = 3;
        int result = find.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas1Then9() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {2, 4, 3, 6, 9, 5, 10, 11, 14, 1, 20};
        int value = 1;
        int result = find.indexOf(input, value);
        int expect = 9;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas20Then7() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {13, 15, 10, 28, 30, 34, 50, 20, 21, 78, 90, 29};
        int value = 20;
        int result = find.indexOf(input, value);
        int expect = 7;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFin3() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));

    }
    @Test
   public void whenNot() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 40;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(expect, is(result));
    }
    @Test
    public void whenNot2() {
        int[] input = new int[] {2, 3, 9, 6, 4, 5};
        int value = 10;
        int start = 6;
        int finish = 5;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
