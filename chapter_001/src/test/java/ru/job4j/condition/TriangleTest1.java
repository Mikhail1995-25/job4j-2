package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TriangleTest1 {
    @Test
    public  void whenExist() {
        boolean result = Triangle1.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }
    @Test
    public void whenExist2() {
        boolean result = Triangle1.exist(2.0, 2.0, 5.0);
        assertThat(result, is(false));
    }
}
