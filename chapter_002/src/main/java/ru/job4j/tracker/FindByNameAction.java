package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        List<Item> result = tracker.findByName(name);
        for (int index = 0; index < result.size(); index++) {
            System.out.println(result.get(index));
        }
        return true;
    }
}
