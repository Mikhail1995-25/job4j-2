package ru.job4j.collection;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class LexSortTest {

    @Test
    public void sortNum1And2and10() {
        String[] input = {
                "10. Task.",
                "1. Task.",
                "2. Task."
        };
        String[] out = {
                "1. Task.",
                "2. Task.",
                "10. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }

    @Test
    public void sortNum10And2And1() {
        String[] input = {
                "2. Task.",
                "10. Task.",
                "1. Task."
        };
        String[] out = {
                "10. Task.",
                "2. Task.",
                "1. Task."
        };
        Arrays.sort(input, new LexSortDesc());
        assertThat(input, is(out));

    }
}
