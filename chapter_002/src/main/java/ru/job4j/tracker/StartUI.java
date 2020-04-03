package ru.job4j.tracker;
public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static Item[] findAllItem(Tracker tracker) {
        System.out.println("=== All items ===");
        Item[] result = tracker.findAll();
        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }
        return result;
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item === ");
        String id = input.askStr("Enter id: ");
        String text = input.askStr(id);
        Item newItem = new Item(text);
        if (tracker.replace(id, newItem)) {
            System.out.println("Замена произведена");
            } else {
            System.out.println("Ошибка");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ===");
        String id = input.askStr("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Удаление произведено.");
        } else {
            System.out.println("Ошибка удаления.");
        }
    }
    public static void findByIdItem(Input input, Tracker tracker) {
        System.out.println("=== find item by id ===");
        String name = input.askStr("Enter id: ");
        Item id = tracker.findById(name);
        if (id != null) {
            System.out.println(id);
        } else {
            System.out.println("Информации не найдено.");
        }
    }

    public static void findByNameItem(Input input, Tracker tracker) {
        System.out.println("find items by name");
        String name = input.askStr("Enter: ");
        Item[] result = tracker.findByName(name);
        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askInt("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
               StartUI.findAllItem(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
               StartUI.findByIdItem(input, tracker);
            } else if (select == 5) {
              StartUI.findByNameItem(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }
    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit program");
    }
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
