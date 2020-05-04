package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class CountTest {
    @Test
    public void add() {
        int result = Counter.sumByEvent(1, 10);
        int expected = 30;
        assertThat(result, is(expected));
    }
    @Test
    public void add2() {
        int result = Counter.sumByEvent(3, 8);
        int expected = 18;
        assertThat(result, is(expected));
    }
}
