package ru.job4j.inheritance;

public class HtmlUsage {
    public static void main(String[] args) {
        HtmlReports report = new HtmlReports();
        String html = report.generate("Report's name", "Report's body");
        System.out.println(html);
    }
}
