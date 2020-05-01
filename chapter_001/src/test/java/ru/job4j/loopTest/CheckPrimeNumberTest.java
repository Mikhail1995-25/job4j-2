package ru.job4j.loopTest;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        boolean rs1 = CheckPrimeNumber.check(5);
        assertThat(rs1, is(true));
    }
    @Test
    public void when4() {
        boolean rs1 = CheckPrimeNumber.check(4);
        assertThat(rs1, is(false));
    }
    @Test
    public void when1() {
        boolean rs1 = CheckPrimeNumber.check(1);
        assertThat(rs1, is(false));
    }
}
