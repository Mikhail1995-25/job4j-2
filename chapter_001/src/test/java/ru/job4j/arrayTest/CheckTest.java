package ru.job4j.arrayTest;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * CheckTest
 * Класс тест.
 */

public class CheckTest {
    /**
     * Method whenDataMonoByTrueThanTrue
     * Проверяет код.
     */
    @Test
    public void whenDataMonoByTrueThanTrue() {
        boolean[] input = new boolean[] {true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));

    }
    @Test
    public void whenDataNotMonoByTrueThanFalse() {
        boolean[]input = new boolean[] {true, false, true};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }
}
