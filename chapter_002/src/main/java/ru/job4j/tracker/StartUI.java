package ru.job4j.tracker;
public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== All items ===");
                Item[] result = tracker.findAll();
                for (int i = 0; i < result.length; i++) {
                    System.out.println(result[i].getId() + " " + result[i].getName());
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                String id = input.askStr("Enter id: ");
                String text = input.askStr(id);
                Item newItem = new Item(text);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Замена произведена");
                } else {
                    System.out.println("Ошибка");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item");
                System.out.println("Enter id: ");
                String id = input.askStr("Enter id: ");
                if(tracker.delete(id)) {
                    System.out.println("Удаление произведено");
                } else {
                    System.out.println("Ошибка");
                }
                tracker.delete(id);
            } else if (select == 4) {
                System.out.println("=== find item by id ===");
                String name = input.askStr("Enter id: ");
                Item id = tracker.findById(name);
                if (id != null) {
                    System.out.println(id.getName() + " " + id.getId());
                } else {
                    System.out.println("Информации не найдено");
                }
            } else if (select == 5) {
                System.out.println("find items by name");
                String name = input.askStr("Enter: ");
                Item[] result = tracker.findByName(name);
                for (int index = 0; index < result.length; index++) {
                    System.out.println(result[index]);
                }
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
