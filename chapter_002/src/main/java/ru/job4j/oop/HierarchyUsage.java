package ru.job4j.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
        /**
         * Создаем объект класса Car.
         */
        Car car = new Car();
        /**
         * Делаем приведение к типу родителя Transport.
         */
        Transport tp = car;
        /**
         * Делаем приведение к типу родителя Object.
         */
        Object obj = car;
        /**
         * Приведение типа при создании объекта.
         */

        Object ocar = new Car();
        /**
         * Приведение типа за счет повышения по ирархии.
         */
         Car carFormObject = (Car) ocar;
        /**
         * Ошибка в приведении типа.
         */
        Object bicycle = new Bicycle();
        Car cb = (Car) bicycle; // Код завершится с ошибок приведения типов ClassCastException.

        System.out.println(new Car());
        System.out.println(new Bicycle());
        System.out.println(new Object());

    }
}
