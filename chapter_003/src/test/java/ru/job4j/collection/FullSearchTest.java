package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FullSearchTest {

    @Test
    public void whenExtractNumber() {
        List<Task> tasks = Arrays.asList(
          new Task("1", "First desk"),
          new Task("2", "Second desk"),
          new Task("1", "First desk")
        );
        Set<String> expected = new HashSet<>(Arrays.asList("1", "2"));
        assertThat(FullSearch.extractNumber(tasks), is(expected));
    }

    @Test
    public void whenExtractNumber5() {
        List<Task> num =  Arrays.asList(
                new Task("1", "Intern programming on the JAVA."),
                new Task("2", "Junior programming on the JAVA."),
                new Task("3", "Middle programming on the JAVA."),
                new Task("4", "Developer programming on the JAVA."),
                new Task("1", "Intern programming on the JAVA.")
        );
        Set<String> expected = new HashSet<>(Arrays.asList("1", "2", "3", "4"));
        assertThat(FullSearch.extractNumber(num), is(expected));
    }
}
