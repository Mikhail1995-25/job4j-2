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
     * Поле инициализируемое в конструкторе.
     */
    private String name;
    /**
     * Constructor Animal
     * Конструктор без параметров.
     */
    public Animal() {
        super();
        System.out.println("load Animal");
    }

    /**
     * Animal
     * @param name - Перегрузка конструктора
     */
    public Animal(String name) {
        this.name = name;

        System.out.println("Animal");

    }



}
