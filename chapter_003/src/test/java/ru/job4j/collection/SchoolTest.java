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
        List<Student> second = School.collect(list, student -> student.getScore() >= 50 && student.getScore() < 70);
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
        List<Student> third = School.collect(list, student -> student.getScore() >= 0 && student.getScore() < 50);
        List<Student> list1 = List.of(new Student(15, "Smirnov"), new Student(30, "Pupkin"));
        assertThat(third.toString(), is(list1.toString()));
    }

    @Test
    public void whenListToMap() {
      List<Student> list = Arrays.asList(
              new Student(80, "Petrov"),
              new Student(30, "Ivanov"),
              new Student(90, "Sokolov"),
              new Student(50, "Vasichkin"),
              new Student(20, "Oleshin"),
              new Student(60, "Kozlov"),
              new Student(15, "Smirnov"),
              new Student(30, "Pupkin"),
              new Student(100, "Kasin")
      );
      Map<Student, String> map = School.collector(list);
      Map<Student, String> expected = new HashMap<>();

      expected.put(list.get(0), list.get(0).getSurname());
        expected.put(list.get(1), list.get(1).getSurname());
        expected.put(list.get(2), list.get(2).getSurname());
        expected.put(list.get(3), list.get(3).getSurname());
        expected.put(list.get(4), list.get(4).getSurname());
        expected.put(list.get(5), list.get(5).getSurname());
        expected.put(list.get(6), list.get(6).getSurname());
        expected.put(list.get(7), list.get(7).getSurname());
        expected.put(list.get(8), list.get(8).getSurname());


      assertThat(map, is(expected));

    }
}
