package ru.job4j.collection;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SchoolTest {

    @Test
    public void whenStudents10AResult() {
        List<Student> list = List.of(
                new Student("Petrov", 80),
                new Student("Ivanov", 30),
                new Student("Sokolov", 90)
        );
       List<Student> first = School.collect(list, student -> student.getScore() >= 70 && student.getScore() <= 100);
        List<Student> list1 = List.of(new Student("Petrov", 80), new Student("Sokolov", 90));
        assertThat(first.toString(), is(list1.toString()));
    }

    @Test
    public void whenStudents10BResult() {
        List<Student> list = List.of(
                new Student("Vasichkin", 50),
                new Student("Oleshin", 20),
                new Student("Kozlov", 60)
        );
        List<Student> second = School.collect(list, student -> student.getScore() >= 50 && student.getScore() < 70);
        List<Student> list1 = List.of(new Student("Vasichkin", 50), new Student("Kozlov", 60));
        assertThat(second.toString(), is(list1.toString()));
    }

    @Test
    public void whenStudents10VResult() {
        List<Student> list = List.of(
                new Student("Smirnov", 15),
                new Student("Pupkin", 30),
                new Student("Kashin", 100)
        );
        List<Student> third = School.collect(list, student -> student.getScore() >= 0 && student.getScore() < 50);
        List<Student> list1 = List.of(new Student("Smirnov", 15), new Student("Pupkin", 30));
        assertThat(third.toString(), is(list1.toString()));
    }

    @Test
    public void whenListToMap() {
      List<Student> list = Arrays.asList(
              new Student("Petrov", 80),
              new Student("Ivanov", 30),
              new Student("Sokolov", 90),
              new Student("Vasichkin", 50),
              new Student("Oleshin", 20),
              new Student("Kozlov", 60),
              new Student("Smirnov", 15),
              new Student("Pupkin", 30),
              new Student("Kashin", 100)
      );
      Map<String, Student> map = School.collector(list);
      Map<String, Student> expected = new HashMap<>();

        expected.put(list.get(0).getSurname(), list.get(0));
        expected.put(list.get(1).getSurname(), list.get(1));
        expected.put(list.get(2).getSurname(), list.get(2));
        expected.put(list.get(3).getSurname(), list.get(3));
        expected.put(list.get(4).getSurname(), list.get(4));
        expected.put(list.get(5).getSurname(), list.get(5));
        expected.put(list.get(6).getSurname(), list.get(6));
        expected.put(list.get(7).getSurname(), list.get(7));
        expected.put(list.get(8).getSurname(), list.get(8));


      assertThat(map, is(expected));

    }
}
