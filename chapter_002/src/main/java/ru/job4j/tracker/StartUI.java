package ru.job4j.tracker;
import java.util.Scanner;
public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
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
                System.out.println("Enter id: ");
                String id = scanner.nextLine();
                String text = scanner.nextLine();
                Item newItem = new Item(text);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Замена произведена");
                } else {
                    System.out.println("Ошибка");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item");
                System.out.println("Enter id: ");
                String id = scanner.nextLine();
                if(tracker.delete(id)) {
                    System.out.println("Удаление произведено");
                } else {
                    System.out.println("Ошибка");
                }
                tracker.delete(id);
            } else if (select == 4) {
                System.out.println("=== find item by id ===");
                System.out.println("Enter id: ");
                String name = scanner.nextLine();
                Item id = tracker.findById(name);
                if (id != null) {
                    System.out.println(id.getName() + " " + id.getId());
                } else {
                    System.out.println("Информации не найдено");
                }
            } else if (select == 5) {
                System.out.println("find items by name");
                String name = scanner.nextLine();
                Item[] result = tracker.findByName(name);
                    System.out.println(result);
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);

    }
}
