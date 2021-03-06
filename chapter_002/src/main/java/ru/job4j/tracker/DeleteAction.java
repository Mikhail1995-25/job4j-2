package ru.job4j.tracker;

public class DeleteAction implements UserAction {


    @Override
    public String name() {
        return "=== Delete Item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Удаление произведено. ");
        } else {
            System.out.println("Ошибка удаления. ");
        }
        return true;
    }
}
