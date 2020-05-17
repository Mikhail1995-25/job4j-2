package ru.job4j.collection;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class School {

    public static List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).distinct().collect(Collectors.toList());
    }

    public static Map<String, Student> collector(List<Student> students) {
        return students.stream().distinct().collect(
                Collectors.toMap(
                        Student::getSurname,
                        student -> student
                )
        );
    }

    public static List<Student> levelOf(List<Student> students, int bounds) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted()
                .takeWhile(v -> v.getScore() > bounds)
                .collect(Collectors.toList());
    }
}
