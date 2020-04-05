package ru.job4j.pseudo;
import org.junit.Test;
import ru.job4j.stragery.Triangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.StringJoiner;

/**
 * @author Mikhail Pushkarev
 * @version 05.04.2020
 * @since 0.1
 */
public class TriangleTest {

    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(
                triangle.draw(),
                is(
                        new StringJoiner(System.lineSeparator())
                        .add("   +   ")
                        .add("  + +  ")
                        .add(" +   + ")
                        .add("+++++++")
                        .toString()
                )
        );
    }
}
