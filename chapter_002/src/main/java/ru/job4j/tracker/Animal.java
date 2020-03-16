package ru.job4j.tracker;

/**
 * Animal
 *
 * @author Mikhail Pushkarev
 * @since 16.03.2020
 * @version 1
 */
public class Animal {
    /**
     * Constructor Animal
     * Конструктор без параметров.
     */
    public Animal() {
        super();
        System.out.println("load Animal");
    }

    /**
     * Main
     * @param args - Вызываем объект дочернего класса, результат будет "load Animal".
     */
    public static void main(String[] args) {
        Predator predator = new Predator();
    }
}
