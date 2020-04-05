package ru.job4j.pseudo;
import org.junit.Test;
import ru.job4j.stragery.Square;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.StringJoiner;

/**
 * @author Mikhail Pushkarev
 * @version 05.04.2020
 * @since 0.1
 */
public class SquareTest {

    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
                is(
                        new StringJoiner(System.lineSeparator())
                        .add("++++++")
                        .add("+    +")
                        .add("+    +")
                        .add("++++++")
                        .toString()
                )
        );
    }
}
