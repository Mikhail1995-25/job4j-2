package ru.job4j.tracker;

/**
 * Tiger
 *
 * @author Mikhail Pushkarev
 * @since 16.03.2020
 * @version 1
 */
public class Tiger extends Predator {
    /**
     * Constructor Tiger
     * Конструктор созданный без параметров.
     */
    public Tiger() {
        super();
        System.out.println("load Animal");
    }

    /**
     * Main
     * @param args - Вызываем объект родителя.
     */
    public static void main(String[] args) {
        Animal animal = new Animal();
    }
}
