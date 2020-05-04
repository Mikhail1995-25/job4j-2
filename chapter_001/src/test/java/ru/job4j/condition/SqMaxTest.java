package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SqMaxTest {
    @Test
    public void sqMax() {
        int result = SqMax.max(6, 4, 7, 5);
        assertThat(result, is(7));
    }
    @Test
    public void sqMax1() {
        int result = SqMax.max(6, 7, 4, 5);
        assertThat(result, is(7));
    }
    @Test
    public void sqMax2() {
        int result = SqMax.max(7, 6, 5, 4);
        assertThat(result, is(7));
    }
    @Test
    public void sqMax3() {
        int result = SqMax.max(4, 6, 5, 7);
        assertThat(result, is(7));
    }

}
