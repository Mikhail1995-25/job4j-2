package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        String text = input.askStr(id);
        Item newItem = new Item(text);
        if (tracker.replace(id, newItem)) {
            System.out.println("Замена произведена. ");
        } else {
            System.out.println("Ошибка.");
        }
        return true;
    }
}
