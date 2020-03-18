package ru.job4j.pojo;

/**
 * Book
 *
 * @author Mikhail Pushkarev
 * @since 18.03.2020
 * @version 3
 */
public class Book {
    /**
     * Поля для именования книги и номера страниц.
     */
    private String name;
    private int pages;

    /**
     * Constructor Book
     * @param name - Принимает имя книги и отдает имя в поле.
     * @param pages - так же принимает и отдает.
     */

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    /**
     * Method get and set
     * @return - возвращает результат на консоль.
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
