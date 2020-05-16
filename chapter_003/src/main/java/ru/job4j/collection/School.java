package ru.job4j.collection;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    public static List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).distinct().collect(Collectors.toList());
    }

    public static Map<Student, String> collector(List<Student> students) {
        return students.stream().distinct().collect(
                Collectors.toMap(
                        student -> student,
                        Student::getSurname
                )
        );
    }
}
