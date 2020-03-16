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
     * Tiger
     * @param name - Принимает параметр и выводит результат на консоль.
     */
    public Tiger(String name) {
        super(name);
        System.out.println("Tiger");

    }

    /**
     * Main
     * @param args - Вызываем объект родителя.
     */
    public static void main(String[] args) {
       Tiger tiger = new Tiger("Tig");
    }
}
