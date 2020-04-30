package ru.job4j.tracker;

import java.util.List;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "=== All Items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> result = tracker.findAll();
        for (int index = 0; index < result.size(); index++) {
            System.out.println(result.get(index));
        }
        return true;
    }
}
