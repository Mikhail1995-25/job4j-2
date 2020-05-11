package ru.job4j.collection;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class DepartmentsTest {

    @Test
    public void whenMissed() {
        List<String> input = Arrays.asList("k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> result = Arrays.asList("k1", "k1/sk1");
        List<String> expect = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortAsc() {
        List<String> input = Arrays.asList("k2/sk1", "k1/sk2", "k1", "k2");
        List<String> result = Arrays.asList("k1", "k1/sk2", "k2", "k2/sk1");
        Departments.sortAsc(input);
        assertThat(input, is(result));
    }

    @Test
    public void whenSortDesc() {
        List<String> input = Arrays.asList("k1/sk2", "k2/sk1", "k2", "k1");
        List<String> result = Arrays.asList("k2", "k2/sk1", "k1", "k1/sk2");
        Departments.sortDesc(input);
        assertThat(input, is(result));
    }

}
