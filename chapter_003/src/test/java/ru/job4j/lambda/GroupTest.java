package ru.job4j.lambda;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GroupTest {
    @Test
    public void whenStudentsAndInterests() {
        List<Student> students = List.of(
                new Student("Михаил", Set.of("Футбол", "Баскетбол")),
                new Student("Александр", Set.of("Футбол", "Ганбол"))
        );
        Map<String, Set<String>> map = Group.sections(students);
        assertThat(map.get("Футбол").toString(), is(List.of("Александр", "Михаил").toString()));
    }
}
