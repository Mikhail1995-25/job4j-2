package ru.job4j.loopTest;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FitnessTest {
    @Test
    public void whenIvanGreatNik() {
        int result = Fitness.calc(95, 90);
        assertThat(result, is(0));
    }
    @Test
    public void whenIvanLessByMik() {
        int result = Fitness.calc(90, 95);
        assertThat(result, is(1));
    }
    @Test
    public void whenIvanLessByFewNik() {
        int result = Fitness.calc(50, 90);
        assertThat(result, is(2));
    }
}
