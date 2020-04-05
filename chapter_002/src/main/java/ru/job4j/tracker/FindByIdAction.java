package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter id: ");
        Item id = tracker.findById(name);
        if (id != null) {
            System.out.println(id);
        } else {
            System.out.println("Информации не найдено.");
        }
        return true;
    }
}
