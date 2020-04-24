package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    LinkedList<Task> tasks = new LinkedList<Task>();

    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (task.getPriority() > element.getPriority()) {
                task.getPriority();
                index++;
                break;
            }
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}
