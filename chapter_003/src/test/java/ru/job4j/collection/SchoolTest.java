package ru.job4j.collection;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SchoolTest {

    @Test
    public void whenStudents10AResult() {
        List<Student> list = List.of(
                new Student(80, "Petrov"),
                new Student(30, "Ivanov"),
                new Student(90, "Sokolov")
        );
       List<Student> first = School.collect(list, student -> student.getScore() >= 70 && student.getScore() <= 100);
        List<Student> list1 = List.of(new Student(80, "Petrov"), new Student(90, "Sokolov"));
        assertThat(first.toString(), is(list1.toString()));
    }

    @Test
    public void whenStudents10BResult() {
        List<Student> list = List.of(
                new Student(50, "Vasichkin"),
                new Student(20, "Oleshin"),
                new Student(60, "Kozlov")
        );
        List<Student> second = School.collect(list, student -> student.getScore() >= 50 && student.getScore() <= 70);
        List<Student> list1 = List.of(new Student(50, "Vasichkin"), new Student(60, "Kozlov"));
        assertThat(second.toString(), is(list1.toString()));
    }

    @Test
    public void whenStudents10VResult() {
        List<Student> list = List.of(
                new Student(15, "Smirnov"),
                new Student(30, "Pupkin"),
                new Student(100, "Kashin")
        );
        List<Student> third = School.collect(list, student -> student.getScore() >= 0 && student.getScore() <= 50);
        List<Student> list1 = List.of(new Student(15, "Smirnov"), new Student(30, "Pupkin"));
        assertThat(third.toString(), is(list1.toString()));
    }
}
