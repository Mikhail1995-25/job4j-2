package ru.job4j.collection;
import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class JobTest {

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rs1 = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rs1, lessThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriorityAsc() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rs1 = cmpNamePriority.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        assertThat(rs1, lessThan(0));
    }

    @Test
    public void whenJobAscendingName() {
        Comparator<Job> jobs = new JobAscByName();
        int rs1 = jobs.compare(
                new Job("Fix bug", 1),
                new Job("X task", 0)
                );
        assertThat(rs1, lessThan(1));
    }

    @Test
    public void whenJobAscendingPriority() {
        Comparator<Job> jobs = new JobAscByPriority();
        int rs1 = jobs.compare(
                new Job("Fix bug", 1),
                new Job("X task", 2)
        );

        assertThat(rs1, lessThan(0));
    }

    @Test
    public void whenJobDescendingName() {
        Comparator<Job> jobs = new JobDescByName();
        int rs1 = jobs.compare(
                new Job("X task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rs1, lessThan(0));
    }

    @Test
    public void whenJobDescendingPriority() {
        Comparator<Job> jobs = new JobAscByPriority();
        int rs1 = jobs.compare(
                new Job("X task", 1),
                new Job("Fix bug", 2)
        );
        assertThat(rs1, lessThan(0));
    }
}
