package ru.job4j.collection;

import java.util.List;
import java.util.stream.Collectors;

class StreamUsage {
    public static class Tasks {
        private final String name;
        private final long spant;

        public Tasks(String name, long spant) {
            this.name = name;
            this.spant = spant;
        }

        @Override
        public String toString() {
            return "Tasks{" + "name='" + name + '\'' + ", spant=" + spant + '}';
        }
    }
    public static void main(String[] args) {
        List<Tasks> tasks = List.of(
                new Tasks("Bug #1", 100),
                new Tasks("Task #2", 100),
                new Tasks("Bug #3", 100)
        );
        List<Tasks> bugs = tasks.stream().filter(
                task -> task.name.contains("Bug")
        ).collect(Collectors.toList());
        bugs.forEach(System.out::println);
    }
}