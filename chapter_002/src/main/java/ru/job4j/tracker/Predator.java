package ru.job4j.tracker;

/**
 * Predator
 *
 * @author Mikhail Pushkarev
 * @since 16.03.2020
 * @version 1
 */
public class Predator extends Animal {

    /**
     * Constructor Predator
     *  Так же без параметров.
     */
    public Predator() {
        super();
        System.out.println("load Predator");
    }

    /**
     * Predator
     * @param name - Принимает параметр, дочерний класс выводит результат на консоль.
     */
    public Predator(String name) {
        super(name);
        System.out.println("Predator");

    }


}
