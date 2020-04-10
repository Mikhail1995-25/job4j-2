package ru.job4j.ex;
import org.junit.Test;

/**
 * @author Mikhail Pushkarev
 * @version 10.04.2020
 * @since 0.2
 */
public class Fact2Test {
    @Test(expected = IllegalArgumentException.class)
    public void whenFact () {
        Fact2.calc(-1);
    }
}
