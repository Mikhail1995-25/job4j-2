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
     * Main
     *
     * @param args - При вызове дочернего объекта в консоле будет результат родительского конструктора,
     *             так как каждый конструктор вызывает конструктор родителя.
     */
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
    }
}
