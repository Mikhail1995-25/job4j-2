package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(mem));
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"one", "1"})
        );
        input.askInt("Enter");
        assertThat(
                mem.toString(),
                is(String.format("Please enter validate data again.%n"))
        );
        System.setOut(out);
    }

    @Test
    public void whenMaxInvalidInput() {
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(mem));
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"one", "1"})
        );
        input.askInt("Enter", 2);
        assertThat(
                mem.toString(),
                is(String.format("Please enter validate data again.%n"))
        );
        System.setOut(out);
    }
}
