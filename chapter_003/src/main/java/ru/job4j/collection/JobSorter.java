package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        //  List<Job> list = Arrays.asList(
        //    new Job("Fix bugs", 4),
        //   new Job("Impl task", 2),
        //  new Job("Reboot server", 1)
        // );
        // System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list);

        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        Collections.sort(jobs, new JobAscByName().thenComparing(new JobAscByPriority()));
        System.out.println(jobs);
        System.out.println();
        Collections.sort(jobs, new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
    }
}
