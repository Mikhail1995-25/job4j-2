package ru.job4j.pojo;

/**
 * Library
 *
 * @author Mikhail Pushkarev
 * @since 18.03.2020
 * @version 3
 */
public class Library {
    /**
     * Main
     * @param args - Принмает параметр.
     */
    public static void main(String[] args) {
        /**
         * Создаем 4 объекта с именем книг и колличеством страниц.
         */
        Book cleancode = new Book("Clean code", 750);
        Book shildt = new Book("Gerbert Shildt", 1190);
        Book first = new Book("Head First", 790);
        Book test = new Book("Test driven", 900);
        /**
         * Создаем массив и записываем в каждую ячейку имя книги.
         */

        Book[] books = new Book[4];

        books[0] = cleancode;
        books[1] = shildt;
        books[2] = first;
        books[3] = test;
        /**
         * С помощью цикла for выводим на консоль результат.
         */

        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(b.getName() + " - " + b.getPages());
        }
        /**
         * Поменять местами ячеки 0 и 3.
         */

            System.out.println("swap books");
            books[0] = test;
            books[1] = shildt;
            books[2] = first;
            books[3] = cleancode;
        /**
         * Вывести результат на консоль  спомощью цикла for.
         */

        for (int index = 0; index < books.length; index++) {
                Book b = books[index];
                System.out.println(b.getName() + " - " + b.getPages());
            }
        /**
         * ВЫвести на консоль определенную книгу с помошью цикла for и условия if.
         */

            System.out.println("Display the clean code book on the console");
            for (int index = 0; index < books.length; index++) {
                Book b = books[index];
                if (b.getPages() == 750) {
                    System.out.println(b.getName() + " - " + b.getPages());
                }
            }

    }
}
