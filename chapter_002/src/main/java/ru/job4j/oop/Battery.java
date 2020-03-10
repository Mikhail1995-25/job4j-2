package ru.job4j.oop;

/**
 * Battery
 * @author Mikhail Pushkarev
 * @since 10.03.2020
 * @version 1.7
 */
public class Battery {
    /**
     * load - Поле принимает значение объекта.
     */
    private int load;

    /**
     *  Konstruktor Battery
     * @param size - Этот конструктор принимает и инициализирует объект.
     */
    public Battery(int size) {
        this.load = size;
    }

    /**
     * Method exchange
     * @param another - Метод принимает выбранный объект, происходит сложение начального с выбранным объектом.
     */
    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    /**
     * Main
     * @param args - Выводит результат на консоль.
     */
    public static void main(String[] args) {
        Battery first = new Battery(90);
        Battery second = new Battery(10);
        System.out.println("First: " + first.load + " Second: " + second.load);
        first.exchange(second);
        System.out.println("First: " + first.load + " Second: " + second.load);
    }
}
