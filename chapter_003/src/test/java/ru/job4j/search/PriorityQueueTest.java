package ru.job4j.search;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
public class PriorityQueueTest {

    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("Low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("Middle", 3));
        Task result = queue.tasks.poll();
        assertThat(result.getDesc(), is("urgent"));
    }
}
