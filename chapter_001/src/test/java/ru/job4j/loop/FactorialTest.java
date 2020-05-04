package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FactorialTest {
    @Test
    public void fact() {
        int result = Factorial.calc(5);
        int expected = 120;
        assertThat(result, is(expected));
    }
    @Test
    public void fact2() {
        int result = Factorial.calc(0);
        int expected = 1;
        assertThat(result, is(expected));
    }
    @Test
    public void fact3() {
        int result = Factorial.calc(1);
        int expected = 1;
        assertThat(result, is(expected));
    }
}
