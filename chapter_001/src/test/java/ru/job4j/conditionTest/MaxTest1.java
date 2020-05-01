package ru.job4j.conditionTest;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MaxTest1 {
    @Test
    public void when1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void when2To1Then() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void when2To2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

}
