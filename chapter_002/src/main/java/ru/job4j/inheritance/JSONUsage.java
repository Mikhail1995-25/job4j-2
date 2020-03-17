package ru.job4j.inheritance;

public class JSONUsage {
    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        String json = report.generate("name", " body");
        System.out.println(json);
    }
}
